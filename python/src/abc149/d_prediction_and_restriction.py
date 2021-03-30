# https://atcoder.jp/contests/abc149/tasks/abc149_d
# r = グー, s=ちょき、p=パー


def main():
    (n, k) = map(int, input().split(" "))
    (point_goo, point_choki, point_par) = map(int, input().split(" "))
    pattern = input()
    # rのときパーで勝てる、sのときグーで勝てる,pのときちょきで勝てる
    # k手前と同じ手は使えないという制約がある
    # つまり一手目から最善手を使えば最大点になるとは限らないということ
    # 途中であえて負ける必要性も出てくる
    # また単純に得点の高い手のときは勝つようにするというのもうまく行かない可能性もある
    point = {"r": point_goo, "s": point_choki, "p": point_par, "-": 0}
    win = {"r": "p", "s": "r", "p": "s", "-": "-"}
    total = 0
    for i in range(n - k):
        total += point[win[pattern[i]]]
        if pattern[i] == pattern[i + k]:
            tmp = pattern[:i + k] + "-" + pattern[i + k + 1:]
            pattern = tmp
    for i in range(n - k, n):
        total += point[win[pattern[i]]]
    print(total)


if __name__ == '__main__':
    main()
