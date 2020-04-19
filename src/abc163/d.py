# https://atcoder.jp/contests/abc163/tasks/abc163_d


def main():
    n, k = map(int, input().split(" "))
    # このやり方だと当然TLE
    # total = 0
    # for i in range(k, n + 2):
    #     a = 0
    #     b = 0
    #     for j in range(i):
    #         a += j
    #         b += n - j
    #     total += b - a + 1
    # print(total)
    total = 0
    for i in range(k, n + 2):
        total += 2 * n - 2 * i + 1
    print(total)


if __name__ == '__main__':
    main()
