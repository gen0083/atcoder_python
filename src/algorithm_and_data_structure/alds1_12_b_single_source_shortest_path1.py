# 単一視点最短経路
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_12_B&lang=jp


def main():
    n = int(input())
    data = [[] for _ in range(n)]
    destination = [float("inf") for _ in range(n)]
    for _ in range(n):
        i, k, *v = map(int, input().split(" "))
        array = [(v[n * 2], v[(n * 2) + 1]) for n in range(k)]
        data[i] = array
    step = 0
    destination[0] = 0
    shortest_path(0, step, data, destination)
    for i, d in enumerate(destination):
        print("%d %d" % (i, d))


def shortest_path(start, step, data, destination):
    for t, c in data[start]:
        cost = step + c
        if destination[t] > cost:
            destination[t] = cost
            shortest_path(t, cost, data, destination)


if __name__ == '__main__':
    main()
