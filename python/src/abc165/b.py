# https://atcoder.jp/contests/abc165/tasks/abc165_b
import math


def main():
    x = int(input())
    current = 100
    i = 0
    while x > current:
        r = math.floor(current * 0.01)
        current += r
        i += 1
    print(i)


if __name__ == '__main__':
    main()
