# 互いに素な集合
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DSL_1_A&lang=jp
import sys


def main():
    n, q = map(int, sys.stdin.readline().strip().split(" "))
    data = [{i} for i in range(n)]
    for _ in range(q):
        command, x, y = map(int, sys.stdin.readline().strip().split(" "))
        if command == 0:
            # union(x, y)
            entry_a = data[x]
            entry_b = data[y]
            if entry_a == entry_b:
                continue
            new_entry = entry_a.union(entry_b)
            for a in entry_a:
                data[a] = new_entry
            for b in entry_b:
                data[b] = new_entry
        else:
            # same(x, y)
            if data[x] == data[y]:
                print("1")
            else:
                print("0")


if __name__ == '__main__':
    main()
