# フィボナッチ数列
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_10_A&lang=jp


def main():
    dp = {0: 1, 1: 1, 2: 2}
    n = int(input())
    print(fib_iterable(n))


def fib(n):
    if n < 2:
        return 1
    else:
        return fib(n - 1) + (fib(n - 2))


def fib_memoize(n, dp):
    if n in dp:
        return dp[n]
    else:
        a = fib_memoize(n - 1, dp) + fib_memoize(n - 2, dp)
        dp[n] = a
        return a


def fib_iterable(n):
    if n < 2:
        return 1
    p = 1
    c = 1
    t = 0
    for _ in range(2, n + 1):
        t = c + p
        p = c
        c = t
    return t


if __name__ == '__main__':
    main()
