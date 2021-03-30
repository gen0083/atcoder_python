# https://atcoder.jp/contests/abc150/tasks/abc150_d


def main():
    n, m = map(int, input().split(" "))
    a = [int(s) for s in input().split(" ")]
    kou = 1
    # 最小公倍数を求める方法が間違ってる
    for i in a:
        j = i // 2
        kou = lcm(kou, j)
    count = m // kou
    if count % 2 == 0:
        count //= 2
    else:
        count = count // 2 + 1
    print(count)


def lcm(n, m):
    g = gcd(n, m)
    return (n * m) // g


def gcd(n, m):
    if n == m:
        return n
    i = max(n, m)
    j = min(n, m)
    p = i % j
    while p != 0:
        i = j
        j = p
        p = i % j
    return j


if __name__ == '__main__':
    main()
