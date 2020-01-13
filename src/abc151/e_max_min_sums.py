# https://atcoder.jp/contests/abc151/tasks/abc151_e


def main():
    n, k = map(int, input().split())
    numbers = [int(s) for s in input().split(" ")]
    numbers = sorted(numbers)
    ans = 0
    for i in range(n):
        for j in range(i + k - 1, n):
            ans += numbers[j] - numbers[i]
    ans += numbers[-1] - numbers[-k]
    ans += numbers[k - 1] - numbers[0]
    if k > 2:
        ans += (numbers[-1] - numbers[0]) * n - k
    print(ans % (10 ** 9 + 7))


if __name__ == '__main__':
    main()
