# https://atcoder.jp/contests/abc156/tasks/abc156_d


def main():
    n, a, b = map(int, input().split(" "))
    count = 0
    t = 1
    even = n % 2 == 0
    for i in range(n // 2):
        t = t * (n - i) // (i + 1)
        p = i + 1
        if p != a and p != b:
            count += t
        r = n - p
        if r == n // 2 and even:
            continue
        if r != a and r != b:
            count += t
    if b != n:
        count += 1
    print(count)


if __name__ == '__main__':
    main()
