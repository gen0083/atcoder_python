# https://atcoder.jp/contests/abc165/tasks/abc165_c


def main():
    n, m, q = map(int, input().split(" "))
    data = {}
    for _ in range(q):
        a, b, c, d = map(int, input().split(" "))
        if (a, b) in data:
            data[(a, b)].append((c, d))
        else:
            data[(a, b)] = [(c, d)]
        data[a - 1][b - 1].append((c, d))
    print(data)


if __name__ == '__main__':
    main()
