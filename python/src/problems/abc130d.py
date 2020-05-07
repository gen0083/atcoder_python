# https://atcoder.jp/contests/abc130/tasks/abc130_d
from collections import deque


def main():
    n, k = map(int, input().split(" "))
    a = [int(s) for s in input().split(" ")]
    count = 0
    total = 0
    q = deque()
    for i in range(n):
        total += a[i]
        q.append(a[i])
        if total >= k:
            count += n - i
            while total >= k:
                t = q.popleft()
                total -= t
                if total >= k:
                    count += n - i
    print(count)


if __name__ == '__main__':
    main()
