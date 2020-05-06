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
    group = [-1 for _ in range(n)]
    not_visited = set(range(n))
    queue = deque()
    g = 0
    while len(not_visited) > 0:
        index = not_visited.pop()
        group[index] = g
        queue.extend(sns[index])
        while len(queue) > 0:
            count = len(queue)
            for _ in range(count):
                friend = queue.popleft()
                if friend in not_visited:
                    not_visited.remove(friend)
                    group[friend] = g
                    queue.extend(sns[friend])
        g += 1
    q = int(input())
    for _ in range(q):
        s, t = map(int, sys.stdin.readline().strip().split(" "))
        if group[s] == group[t]:
            print("yes")
        else:
            print("no")


if __name__ == '__main__':
    main()
