# https://atcoder.jp/contests/abc150/tasks/abc150_a


def main():
    coins, test = map(int, input().split(" "))
    if 500 * coins >= test:
        print("Yes")
    else:
        print("No")


if __name__ == '__main__':
    main()
