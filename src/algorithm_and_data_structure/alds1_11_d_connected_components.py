# 連結成分
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_11_D&lang=jp
import sys
from collections import deque


def main():
    n, m = map(int, sys.stdin.readline().strip().split(" "))
    sns = [[] for _ in range(n)]
    for _ in range(m):
        person, friend = map(int, sys.stdin.readline().strip().split(" "))
        sns[person].append(friend)
        sns[friend].append(person)
    q = int(input())
    for _ in range(q):
        s, t = map(int, sys.stdin.readline().strip().split(" "))
        visited = {s}
        queue = deque(sns[s])
        reachable = False
        while len(queue) > 0 and not reachable:
            count = len(queue)
            for _ in range(count):
                to = queue.popleft()
                if to == t:
                    reachable = True
                    break
                if to not in visited:
                    queue.extend(sns[to])
                    visited.add(to)
        if reachable:
            print("yes")
        else:
            print("no")


if __name__ == '__main__':
    main()
