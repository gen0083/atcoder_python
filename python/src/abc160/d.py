# https://atcoder.jp/contests/abc160/tasks/abc160_d


def main():
    n, x, y = map(int, input().split(" "))
    k = [0 for _ in range(n)]
    steps = [[j - i for i in range(n + 1)] for j in range(n + 1)]
    break_point = (y - x) // 2 + x
    even_break = 0
    if (y - x) % 2 == 0:
        even_break = 1
    for i in range(1, n):
        for j in range(i + 1, n + 1):
            if j < x or i > y:
                k[steps[i][j]] += 1
                continue
            if i < break_point < j < y:
                k[steps[i][j] - (y - break_point)] += 1
                continue
            k[steps[i][j]] += 1

    for i in range(1, n):
        print(k[i])


if __name__ == '__main__':
    main()
