#!/bin/sh

CALL_DIR=`dirname $0`
BASE_DIR=~/program/procon/atcoder_python/rust/

if [ "$#" = 0 ]; then
	code $BASE_DIR
else
	# 引数ありの場合
	if [ -d $BASE_DIR$1 ]; then
		# 該当の問題をcodeで開く
		code $BASE_DIR$1
	else
		# 新規の問題作成
		# cargo-competeで問題作ってその問題のディレクトリでcodeを開く
		cd $BASE_DIR
		cargo compete new $1
		code $BASE_DIR$1
		cd $CALL_DIR
	fi
fi

