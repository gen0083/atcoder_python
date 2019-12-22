# https://atcoder.jp/contests/abc148/tasks/abc148_e
# TODO: timeoutを乗り越えろ

dp = dict()


def f(n):
    if n < 2:
        return 1
    else:
        if n in dp:
            return dp[n]
        else:
            a = 0
            if n - 2 in dp:
                a = n * dp[n - 2]
            else:
                a = n * f(n - 2)
            dp[n] = a
            return a


def main():
    num = int(input())
    for i in range(num % 2, num, 2):
        f(i)
    a = f(num)
    count = 0
    for s in str(a)[::-1]:
        if s == "0":
            count += 1
        else:
            break
    print(count)


if __name__ == '__main__':
    main()
