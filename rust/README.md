競技プログラミング with Rust
===

[オフィシャルドキュメント](https://doc.rust-lang.org/book/title-page.html)

[VSCode拡張について](https://tech-blog.optim.co.jp/entry/2019/07/18/173000)

### Kotlin使ってたときの癖でよくやりがち。

- 行末にセミコロンつけ忘れ
- ifのコンディションには`()`不要
- でもtrue/elseのブロックの`{}`は必須（中身が一行でも要る）
- inputマクロを使う際に各行をセミコロンで区切りがち(ここは`,`)

## AtCoderをRustでやるのに便利なツール

### proconio

[proconio](https://docs.rs/proconio/0.4.3/proconio/)

標準入力の読み込みが簡単に定義できる。

### cargo-compete

[cargo-compete](https://github.com/qryxip/cargo-compete)

問題用のディレクトリ作成、サンプルテストケースを自動的に取り込んだり、参加登録とかもできる。ブラウザなくてもsubmitできる。便利。

`cargo new <コンテストID>`でコンテスト用のディレクトリを作成。コンテストIDはコンテストのURLの末尾。

作成されたディレクトリに移動し、`cargo test <問題>`で該当のテストを実行(`cargo test a`など)。

`cargo compete submit`で該当の問題を提出。提出前にテストが実行されるので、`cargo compete test`はやらなくてもよい。

#### toolchainのバージョン

AtCoderでは`1.42.0`が使われるが、このバージョンだとApple silliconで`cargo`が動かない。そのため自環境で動いている`1.53.0`を使うようにした。