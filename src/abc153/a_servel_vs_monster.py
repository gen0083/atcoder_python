# https://atcoder.jp/contests/abc153/tasks/abc153_a


def main():
    h, a = map(int, input().split(" "))
    atack = h // a
    if atack * a < h:
        atack += 1
    print(atack)


if __name__ == '__main__':
    main()
