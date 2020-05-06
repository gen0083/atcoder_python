# https://atcoder.jp/contests/abc163/tasks/abc163_b


def main():
    n, m = map(int, input().split(" "))
    a = [int(s) for s in input().split(" ")]
    total = sum(a)
    if n >= total:
        print(n - total)
    else:
        print("-1")


if __name__ == '__main__':
    main()
