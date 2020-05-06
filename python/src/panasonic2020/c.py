# https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_c
from decimal import Decimal


def main():
    a, b, c = map(Decimal, input().split(" "))
    if a.sqrt() + b.sqrt() < c.sqrt():
        print("Yes")
    else:
        print("No")


if __name__ == '__main__':
    main()
