# https://atcoder.jp/contests/agc041/tasks/agc041_a


def main():
    (n, a, b) = map(int, input().split(" "))
    ans = abs(a - b)
    if ans % 2 == 0:
        ans //= 2
    else:
        ato1 = a - 1
        bton = n - b
        if ato1 <= bton:
            # aを1に動かすほうが早い
            b = b - ato1
            if b % 2 == 0:
                ans = b // 2 + ato1
            else:
                ans = b // 2 + ato1 + 1
        else:
            # bをnに動かしたほうが早い
            a = a + bton
            if abs(n - a) % 2 == 0:
                ans = (n - a) // 2 + bton
            else:
                ans = (n - a) // 2 + bton + 1
    print(ans)


if __name__ == '__main__':
    main()
