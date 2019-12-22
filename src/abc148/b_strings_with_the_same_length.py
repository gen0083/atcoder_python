# https://atcoder.jp/contests/abc148/tasks/abc148_b
import sys


def main():
    num = int(input())
    (s, t) = input().split(" ")
    for i in range(num):
        sys.stdout.write(s[i])
        sys.stdout.write(t[i])
    sys.stdout.write("\n")


if __name__ == '__main__':
    main()
