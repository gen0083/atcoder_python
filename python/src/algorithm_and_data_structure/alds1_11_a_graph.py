# グラフの表現
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_11_A&lang=jp


def main():
    n = int(input())
    m = [[0] * n for _ in range(n)]
    for _ in range(n):
        i, k, *v = map(int, input().split(" "))
        for j in v:
            m[i - 1][j - 1] = 1
    for a in m:
        print(" ".join(map(str, a)))


if __name__ == '__main__':
    main()
