# https://atcoder.jp/contests/abc161/tasks/abc161_c


def main():
    n, k = map(int, input().split(" "))
    a = n % k
    b = abs(a - k)
    print(min(a, b))


if __name__ == '__main__':
    main()
