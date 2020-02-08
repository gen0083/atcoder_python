# 単一視点最短経路
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_12_C&lang=jp
import sys
import heapq


def main():
    n = int(input())
    data = [[] for _ in range(n)]
    destination = [float("inf") for _ in range(n)]
    destination[0] = 0
    for _ in range(n):
        i, k, *v = map(int, sys.stdin.readline().strip().split(" "))
        array = [(v[n * 2], v[(n * 2) + 1]) for n in range(k)]
        data[i] = array
    mst = {0}
    p = 0
    min_dest = []
    min_dest_finder = {}
    while len(mst) < n:
        # mstに属する頂点から到達できる周囲の頂点について到達コストを更新する
        # 新たにMSTに属する頂点から移動できる先のみコスト更新すれば足りる
        for t, c in data[p]:
            # 移動先がすでにmstに属しているならスキップ
            if t in mst:
                continue
            cost = destination[p] + c
            # 到達コストが小さくなるなら更新する
            if destination[t] > cost:
                destination[t] = cost
                if t in min_dest_finder:
                    entry = min_dest_finder.pop(t)
                    entry[-1] = -1
                task = [cost, t]
                heapq.heappush(min_dest, task)
                min_dest_finder[t] = task
            # 周囲の頂点のうち到達コストがもっとも小さいものを新たにmstに追加したいので最小コストの頂点を記録
        next_v = (0, -1)
        while next_v[1] == -1:
            next_v = heapq.heappop(min_dest)
            if next_v[1] != -1:
                del min_dest_finder[next_v[1]]
        mst.add(next_v[1])
        p = next_v[1]
    for i, d in enumerate(destination):
        print("%d %d" % (i, d))


if __name__ == '__main__':
    main()
