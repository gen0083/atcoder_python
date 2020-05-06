# https://atcoder.jp/contests/abc155/tasks/abc155_c
import sys


def main():
    n = int(sys.stdin.readline().strip())
    poll = dict()
    max_num = 1
    for _ in range(n):
        p = sys.stdin.readline().strip()
        if p in poll:
            poll[p] += 1
            if max_num < poll[p]:
                max_num = poll[p]
        else:
            poll[p] = 1
    array = []
    for v in poll:
        if poll[v] == max_num:
            array.append(v)
    array.sort()
    for s in array:
        print(s)


if __name__ == '__main__':
    main()
