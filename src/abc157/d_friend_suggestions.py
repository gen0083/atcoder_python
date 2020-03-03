import sys
from collections import deque


def main():
    n, m, k = map(int, input().split(" "))
    cluster = [set() for _ in range(n)]
    count = [0] * n
    for _ in range(m + k):
        i, j = map(int, sys.stdin.readline().strip().split(" "))
        cluster[i - 1].add(j)
        cluster[j - 1].add(i)
        count[i - 1] += 1
        count[j - 1] += 1
    cluster_size = [-1] * n
    for i in range(n):
        if cluster_size[i] != -1:
            continue
        stack = deque()
        stack.append(cluster[i])
        space = {i + 1}
        while len(stack) > 0:
            s = stack.pop()
            for v in s:
                if v not in space:
                    space.add(v)
                    stack.append(cluster[v - 1])
        size = len(space)
        for v in space:
            cluster_size[v - 1] = size
    ans = []
    for i in range(n):
        ans.append(str(cluster_size[i] - 1 - count[i]))
    print(" ".join(ans))


if __name__ == '__main__':
    main()
