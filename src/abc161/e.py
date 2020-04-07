# https://atcoder.jp/contests/abc161/tasks/abc161_e


def main():
    n, k, c = map(int, input().split(" "))
    s = [s for s in input()]
    l = [0] * n
    r = [0] * n
    day = 1
    i = 0
    while day <= k and i < n:
        if s[i] == "o":
            l[i] = day
            day += 1
            i += c + 1
        else:
            i += 1
    i = n - 1
    day = k
    while day > 0 and i >= 0:
        if s[i] == "o":
            r[i] = day
            day -= 1
            i -= c + 1
        else:
            i -= 1
    for i in range(n):
        if l[i] > 0 and l[i] == r[i]:
            print(i + 1)


if __name__ == '__main__':
    main()
