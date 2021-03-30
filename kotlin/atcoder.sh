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

if [ $# -ne 1 ]; then
  echo "must set exactly one argument."
  exit 1
fi

cd "$(dirname $0)"
source_dir="src/main/kotlin/"
test_dir="src/test/kotlin/"
array=("a" "b" "c" "d" "e" "f")
template_for_source="atcoder_template.txt"
template_for_test="atcoder_template_for_test.txt"

contest_name="$1"
target_source_dir="$source_dir$1"
target_test_dir="$test_dir$1"
if [ -e "$target_source_dir" ]; then
  echo "$target_source_dir is already exist."
  exit 1
fi
mkdir "$target_source_dir"
if [ -e "$target_test_dir" ]; then
  echo "$target_test_dir is already exist."
  exit 1
fi
mkdir "$target_test_dir"

function make_files() {
  contest_file_name="$contest_name$1"
  file_name="$target_source_dir/$contest_file_name.kt"
  while IFS= read -r line; do
    eval "echo \"${line}\"" >>"$file_name"
  done <"$template_for_source"
  contest_test_name="${contest_file_name}KtTest"
  contest_test_name="$(tr '[:lower:]' '[:upper:]' <<< "${contest_test_name:0:1}")${contest_test_name:1}"
  file_name="$target_test_dir/$contest_test_name.kt"
  while IFS= read -r line; do
    eval "echo \"${line}\"" >>"$file_name"
  done <"$template_for_test"
  return 0
}

for v in "${array[@]}"; do
  make_files "$v"
done
