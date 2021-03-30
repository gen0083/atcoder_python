# https://atcoder.jp/contests/abc154/tasks/abc154_d


def main():
    n, k = map(int, input().split(" "))
    line = [int(s) for s in input().split(" ")]
    max_num = 0
    start = 0
    total = 0
    for i in range(k):
        total += line[i]
        if max_num < line[i]:
            max_num = line[i]
    max_sum = total
    for i in range(k, n):
        total = total + line[i] - line[i - k]
        if max_num < line[i]:
            max_num = line[i]
        if max_sum < total:
            max_sum = total
            start = i - k + 1
    kitai = [0.0 for _ in range(max_num + 1)]
    total = 0
    for i in range(1, max_num + 1):
        total += i
        kitai[i] = total / i
    total = 0
    for i in range(start, start + k):
        total += kitai[line[i]]
    print(total)


if __name__ == '__main__':
    main()
