# https://atcoder.jp/contests/abc149/tasks/abc149_b


def main():
    (a, b, k) = map(int, input().split(" "))
    if a > k:
        print("%d %d" % (a - k, b))
    elif a + b > k:
        r = k - a
        print("%d %d" % (0, b - r))
    else:
        print("0 0")


if __name__ == '__main__':
    main()
