# https://atcoder.jp/contests/abc158/tasks/abc158_b


def main():
    n, a, b = map(int, input().split(" "))
    if a == 0:
        print("0")
        return
    count = (n // (a + b))
    ans = count * a
    if count * (a + b) != n:
        remain = n - (count * (a + b))
        if remain < a:
            ans += remain
        else:
            ans += a
    print(ans)


if __name__ == '__main__':
    main()
