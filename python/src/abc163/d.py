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
    max_num = sum(range(n - k + 1, n + 1))
    min_num = sum(range(k))
    c = max_num - min_num + 1
    total = c
    for i in range(k, n + 1):
        max_num += n - i
        min_num += i
        c = max_num - min_num + 1
        total += c
    print(total % 1000000007)


if __name__ == '__main__':
    main()
