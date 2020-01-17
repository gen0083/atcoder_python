# 最長共通部分列
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_10_C&lang=jp
import sys


def main():
    q = int(sys.stdin.readline().strip())
    for _ in range(q):
        x = sys.stdin.readline().strip()
        y = sys.stdin.readline().strip()
        dp = [[0 for _ in range(len(y) + 1)] for _ in range(len(x) + 1)]
        for i, cx in enumerate(x):
            i += 1
            for j, cy in enumerate(y):
                j += 1
                if cx == cy:
                    dp[i][j] = dp[i - 1][j - 1] + 1
                elif dp[i - 1][j] >= dp[i][j - 1]:
                    dp[i][j] = dp[i - 1][j]
                else:
                    dp[i][j] = dp[i][j - 1]
        print(dp[len(x)][len(y)])


if __name__ == '__main__':
    main()
