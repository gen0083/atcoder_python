# 完全二分木
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_9_A&lang=jp
import sys


def main():
    n = int(input())
    heap = [""] * (n + 1)
    i = 1
    for s in input().split():
        heap[i] = s
        i += 1
    for i in range(1, n + 1):
        sys.stdout.write("node %d: key = %s," % (i, heap[i]))
        if i // 2 > 0:
            sys.stdout.write(" parent key = %s," % heap[i // 2])
        if i * 2 <= n:
            sys.stdout.write(" left key = %s," % heap[i * 2])
        if i * 2 + 1 <= n:
            sys.stdout.write(" right key = %s," % heap[i * 2 + 1])
        print(" ")


if __name__ == '__main__':
    main()
