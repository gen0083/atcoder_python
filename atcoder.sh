#!/bin/bash

# AtCoderのコンテスト用テンプレートファイル作成スクリプト
# atcoder.sh abc158
# という入力でabc158と各ファイルのテンプレートを展開するスクリプト
# src
#  +- 引数
#    +- __init__.py
#    +- a.py ... f.py
#    +- test_a.py ... test_f.py
set -eu
base_dir="src/"
array=("a" "b" "c" "d" "e" "f")
template_for_source="atcoder_template.txt"
template_for_test="atcoder_template_for_test.txt"

function make_source() {
  local file_name="$target_dir/$1.py"
  echo "$file_name"
  while IFS= read -r line; do
    echo "$line" >> "$file_name"
  done <"$template_for_source"
  return 0
}

function make_test() {
  local file_name="$target_dir/test_$1.py"
  echo "$file_name"
  while IFS= read -r line; do
    eval "echo \"${line}\"" >> "$file_name"
  done < "$template_for_test"
}

if [ $# -ne 1 ]; then
  echo "must set exactly one argument."
  exit 1
fi
contest_name="$1"
target_dir="$base_dir$1"
if [ -e "$target_dir" ]; then
  echo "$target_dir is already exist."
  exit 1
fi

mkdir "$target_dir"
touch "$target_dir/__init__.py"

for v in "${array[@]}"; do
  make_source "$v"
  make_test "$v"
done
