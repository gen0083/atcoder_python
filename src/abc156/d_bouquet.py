# https://atcoder.jp/contests/abc156/tasks/abc156_d


def main():
    n, a, b = map(int, input().split(" "))
    total = n
    p = n
    odd = n % 2 == 0
    limit = n // 2
    plus_one = True
    avoid = 0
    if a > limit:
        a //= 2
    if b == n:
        plus_one = False
        b = 0
    if b > limit:
        b //= 2
    for i in range(1, limit + 1):
        f = max(n + 1 - i, 1)
        if i == 1:
            p = n
        else:
            p = p * f // i
        if i == a or i == b:
            avoid += p
        total += p
    if not odd:
        total -= p
    total = total * 2 - avoid
    if not odd:
        total += p
    if plus_one:
        total += 1
    print(total % (10**9 + 7))


if __name__ == '__main__':
    main()
