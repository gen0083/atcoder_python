# https://atcoder.jp/contests/abc156/tasks/abc156_a


def main():
    n, r = map(int, input().split(" "))
    if n > 10:
        print(r)
    else:
        print(r + ((10 - n) * 100))


if __name__ == '__main__':
    main()
