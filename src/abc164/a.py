# https://atcoder.jp/contests/abc164/tasks/abc164_a


def main():
    s, w = map(int, input().split(" "))
    if w >= s:
        print("unsafe")
    else:
        print("safe")


if __name__ == '__main__':
    main()
