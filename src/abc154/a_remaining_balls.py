# https://atcoder.jp/contests/abc154/tasks/abc154_a


def main():
    s, t = input().split(" ")
    a, b = map(int, input().split(" "))
    u = input()
    if u == s:
        a -= 1
    elif u == t:
        b -= 1
    print("%d %d" % (a, b))


if __name__ == '__main__':
    main()
