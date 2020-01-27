# https://atcoder.jp/contests/abc153/tasks/abc153_b


def main():
    h, n = map(int, input().split(" "))
    hissatu = [int(s) for s in input().split(" ")]
    total = sum(hissatu)
    if h > total:
        print("No")
    else:
        print("Yes")


if __name__ == '__main__':
    main()
