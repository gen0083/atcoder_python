# https://atcoder.jp/contests/abc159/tasks/abc159_d


def main():
    n = int(input())
    a = [int(s) for s in input().split(" ")]
    counts = {}
    for i in a:
        if i in counts:
            counts[i] += 1
        else:
            counts[i] = 1
    # これだとTLE
    # results = {}
    # for i in a:
    #     if i in results:
    #         print(results[i])
    #         continue
    #     count = 0
    #     for k, v in counts.items():
    #         if k == i:
    #             v -= 1
    #         if v > 1:
    #             count += (v * (v - 1) // 2)
    #     print(count)
    #     results[i] = count
    total = 0
    comb = {}
    for k in counts:
        if counts[k] > 1:
            y = counts[k]
            x = (y * (y - 1)) // 2
            total += x
            comb[k] = x
        else:
            comb[k] = 0
    for i in a:
        print(total - (counts[i] - 1))


if __name__ == '__main__':
    main()
