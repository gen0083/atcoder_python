# 最小全域木
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_12_A&lang=jp
import heapq


def main():
    n = int(input())
    data = [list(map(int, input().lstrip().split(" "))) for _ in range(n)]
    visited = {0}
    total = 0
    while len(visited) < n:
        min_cost = float("inf")
        target = 0
        for i in visited:
            for j in range(n):
                if j in visited:
                    continue
                if data[i][j] == -1:
                    continue
                if min_cost > data[i][j]:
                    min_cost = data[i][j]
                    target = j
        total += min_cost
        visited.add(target)
    print(total)


if __name__ == '__main__':
    main()
