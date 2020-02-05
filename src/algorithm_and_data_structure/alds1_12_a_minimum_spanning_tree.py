# 最小全域木
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_12_A&lang=jp
import heapq


def main():
    n = int(input())
    data = [[] for _ in range(n)]
    minimum = (float("inf"), 0, 0)
    for f in range(n):
        line = map(int, input().split(" "))
        for t, p in enumerate(line):
            if p > -1:
                heapq.heappush(data[f], (p, t))
                if minimum[0] > p:
                    minimum = (p, f)
    visited = set()
    stack = []
    c = minimum[1]
    total = 0
    while len(stack) > 0 or len(visited) < n:
        array = data[c]
        stack.append(c)
        if len(array) <= 0:
            while len(array) <= 0 and len(stack) > 0:
                s = stack.pop()
                array = data[s]
        p, t = heapq.heappop(array)
        if c not in visited:
            total += p
            visited.add(c)
            c = t
    print(total)


if __name__ == '__main__':
    main()
