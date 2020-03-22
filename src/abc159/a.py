# https://atcoder.jp/contests/abc159/tasks/abc159_a


def main():
    n, m = map(int, input().split(" "))
    count = 0
    if n > 1:
        count += (n * (n - 1) // 2)
    if m > 1:
        count += (m * (m - 1) // 2)
    print(count)


if __name__ == '__main__':
    main()
