# 幅優先探索
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_11_C&lang=jp
from collections import deque


def main():
    n = int(input())
    t = [-1 for _ in range(n)]
    t[0] = 0
    v = [0] * n
    for i in range(n):
        i, k, *nodes = map(int, input().split(" "))
        if k == 0:
            nodes = []
        v[i - 1] = nodes
    queue = deque(v[0])
    step = 1
    visited = {1}
    while len(queue) > 0:
        count = len(queue)
        for i in range(count):
            node = queue.popleft()
            if node not in visited:
                t[node - 1] = step
                queue.extend(v[node - 1])
                visited.add(node)
        step += 1
    for i, time in enumerate(t, 1):
        print("%d %d" % (i, time))


if __name__ == '__main__':
    main()
