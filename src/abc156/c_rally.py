# https://atcoder.jp/contests/abc156/tasks/abc156_c


def main():
    n = int(input())
    array = [int(s) for s in input().split(" ")]
    min_v = min(array)
    max_v = max(array)
    min_ans = float("inf")
    for i in range(min_v, max_v + 1):
        total = 0
        for a in array:
            total += (a - i) ** 2
        if min_ans > total:
            min_ans = total
    print(min_ans)


if __name__ == '__main__':
    main()
