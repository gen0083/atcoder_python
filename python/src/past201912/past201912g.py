def main():
    n = int(input())
    # nは10までなので、全組み合わせを試して幸福度の合計を算出すれば解けるのではないだろうか
    # ただし3グループに分割するというのがややこしい、組み合わせのパターンを網羅するのがややこしい
    # グループを区別しなくていいが、そうするとややこしいので3つまでのグループをすべて区別してパターンを作る
    # その上でグループ内のメンバーをキーとして幸福度の計算結果を再利用すれば計算量的には求まりそう
    # ネックはパターンの生成で、そこがよくわからん
    p = []
    generate_pattern(p, 1, set(), n + 1)
    full_set = set(range(1, n + 1))
    pattern = []
    for p1 in p:
        for p2 in p:
            if not p1.isdisjoint(p2):
                continue
            pt = p1 | p2
            p3 = full_set ^ pt
            pattern.append((p1, p2, p3))
    a = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
    i = 1
    for _ in range(n - 1):
        j = i + 1
        s = input().split(" ")
        for v in s:
            a[i][j] = int(v)
            j += 1
        i += 1
    dp = dict()
    happy = -10000000
    for group in pattern:
        h = 0
        for g in group:
            s = set_to_str(g)
            if s in dp:
                h += dp[s]
            else:
                # aを使って幸福度を計算
                k = list(g)
                k.sort()
                t = 0
                for i in range(len(k)):
                    for j in range(i + 1, len(k)):
                        tt = a[k[i]][k[j]]
                        t += tt
                h += t
                dp[s] = t
        if happy < h:
            happy = h
    print(happy)


def generate_pattern(array, n, c, end):
    if n == end:
        array.append(c)
    else:
        generate_pattern(array, n + 1, c, end)
        a = c | {n}
        generate_pattern(array, n + 1, a, end)


def set_to_str(s):
    if len(s) > 0:
        return "".join(map(str, s))
    else:
        "0"


if __name__ == '__main__':
    main()
