# https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_b
import math


def main():
    h, w = map(int, input().split(" "))
    if h == 1 or w == 1:
        print("1")
        return
    print(math.ceil((h * w) / 2))


if __name__ == '__main__':
    main()
