# https://atcoder.jp/contests/abc148/tasks/abc148_c
import fractions
# math.gcdは3.5からなのでAtCoderで使えない
# import math


def main():
    (a, b) = [int(i) for i in input().split(" ")]
    print(int(a * b / fractions.gcd(a, b)))


if __name__ == '__main__':
    main()
