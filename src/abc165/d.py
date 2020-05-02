# https://atcoder.jp/contests/abc165/tasks/abc165_d


def main():
    a, b, n = map(int, input().split(" "))
    fac = 0
    start = min(b, n)
    if b <= n:
        fac = start - 1
    else:
        fac = start
    ans = a * fac // b - a * (fac // b)
    print(ans)


if __name__ == '__main__':
    main()
