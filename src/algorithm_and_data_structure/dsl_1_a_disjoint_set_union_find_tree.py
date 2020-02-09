# 互いに素な集合
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DSL_1_A&lang=jp
import sys


class DisjointSet(object):
    def __init__(self, size):
        self.data = [i for i in range(size)]
        self.rank = [0 for _ in range(size)]

    def find_root(self, x):
        # rootノードまでたどる最中に、各要素がrootを指し示すように更新することで経路を短縮する
        p = x
        while self.data[p] != p:
            p = self.data[p]
            self.data[x] = p
        self.rank[x] = 0
        return p

    def union(self, x, y):
        root_x = self.find_root(x)
        root_y = self.find_root(y)
        # rank, ツリーの高さを表す
        # 低いツリーをrootに据えたほうが効率がよくなるのでどちらを親としてつなげるかを判定している
        # （高さが高いほど、rootにたどり着くまでの計算量が増えるため、ツリーの高さは低く保ちたい）
        if self.rank[root_x] <= self.rank[root_y]:
            self.rank[root_y] += 1
            self.data[root_y] = root_x
        else:
            self.rank[root_x] += 1
            self.data[root_x] = root_y

    def same(self, x, y):
        root_x = self.find_root(x)
        root_y = self.find_root(y)
        if root_x == root_y:
            print("1")
        else:
            print("0")


def main():
    n, q = map(int, sys.stdin.readline().strip().split(" "))
    disjoint_set = DisjointSet(n)
    for _ in range(q):
        command, x, y = map(int, sys.stdin.readline().strip().split(" "))
        if command == 0:
            # union(x, y)
            disjoint_set.union(x, y)
        else:
            # same(x, y)
            disjoint_set.same(x, y)


if __name__ == '__main__':
    main()
