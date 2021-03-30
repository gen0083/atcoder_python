# https://atcoder.jp/contests/abc162/tasks/abc162_c
from math import gcd


def main():
    k = int(input())
    total = 0
    for i in range(1, k + 1):
        for j in range(1, k + 1):
            g = gcd(i, j)
            for l in range(1, k + 1):
                total += gcd(g, l)
    print(total)


if __name__ == '__main__':
    main()
