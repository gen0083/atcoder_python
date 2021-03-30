# https://atcoder.jp/contests/agc043/tasks/agc043_a


def main():
    h, w = map(int, input().split(" "))
    m = []
    for i in range(h):
        line = ['']
        line.extend(input())
        line[0] = line[1]
        m.append(line)
        if i == 0:
            m.append(line)
    dp = [[float("inf")] * (w + 1) for _ in range(h + 1)]
    if m[0][0] == "#":
        dp[0][1] = 1
        dp[1][0] = 1
    else:
        dp[0][1] = 0
        dp[1][0] = 0
    for i in range(1, h + 1):
        for j in range(1, w + 1):
            c = m[i][j]
            sh, sw = i - 1, j
            if dp[sh][sw] == dp[i][j - 1]:
                if m[sh][sw] != c:
                    sh, sw = i, j - 1
            elif dp[sh][sw] > dp[i][j - 1]:
                sh, sw = i, j - 1
            dp[i][j] = dp[sh][sw]
            if m[sh][sw] != c and c != '.':
                dp[i][j] += 1
            # 上のマスのコスト(dp上の位置)
            # sh, sw = i - 1, j
            # # m上の位置へ変換
            # th, tw = sh - 1, sw - 1
            # if dp[sh][sw] > dp[i][j - 1]:
            #     sh, sw = i, j - 1
            #     th, tw = sh - 1, sw - 1
            #     # どちらのコストも同じなら色が同じ方を選ぶ
            # elif m[th][tw] != c:
            #     sh, sw = i, j - 1
            #     th, tw = sh - 1, sw - 1
            # dp[i][j] = dp[sh][sw]
            # ph, pw = i - 1, j - 1
            # if th < 0 or tw < 0:
            #     continue
            # if m[th][tw] != c:
            #     dp[i][j] += 1
    print(dp[h][w])


if __name__ == '__main__':
    main()
