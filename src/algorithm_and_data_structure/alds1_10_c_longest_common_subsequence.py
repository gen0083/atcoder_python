# 最長共通部分列
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_10_C&lang=jp
import sys


def main():
    q = int(sys.stdin.readline().strip())
    for _ in range(q):
        x = sys.stdin.readline().strip()
        y = sys.stdin.readline().strip()
        dp = [0 for _ in range(len(y) + 1)]
        for i, cx in enumerate(x, 1):
            prev = dp[:]
            for j, cy in enumerate(y, 1):
                if cx == cy:
                    dp[j] = prev[j - 1] + 1
                elif dp[j - 1] > prev[j]:
                    dp[j] = dp[j - 1]
                else:
                    dp[j] = prev[j]
        print(dp[-1])


if __name__ == '__main__':
    main()
