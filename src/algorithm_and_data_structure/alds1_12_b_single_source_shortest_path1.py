# 単一視点最短経路
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_12_B&lang=jp


def main():
    n = int(input())
    data = [[] for _ in range(n)]
    destination = [float("inf") for _ in range(n)]
    destination[0] = 0
    for _ in range(n):
        i, k, *v = map(int, input().split(" "))
        array = [(v[n * 2], v[(n * 2) + 1]) for n in range(k)]
        data[i] = array
    mst = {0}
    while len(mst) < n:
        # mstの周りの頂点に到達するまでのコストでもっとも小さいものを記憶する変数
        mini = (0, float("inf"))
        for i in mst:
            # mstに属する頂点から到達できる周囲の頂点について到達コストを更新する
            for t, c in data[i]:
                cost = destination[i] + c
                # 移動先がすでにmstに属しているならスキップ
                if t in mst:
                    continue
                # 到達コストが小さくなるなら更新する
                if destination[t] > cost:
                    destination[t] = cost
                # 周囲の頂点のうち到達コストがもっとも小さいものを新たにmstに追加したいので最小コストの頂点を記録
                if mini[1] > cost:
                    mini = (t, c)
        mst.add(mini[0])
    for i, d in enumerate(destination):
        print("%d %d" % (i, d))


if __name__ == '__main__':
    main()
