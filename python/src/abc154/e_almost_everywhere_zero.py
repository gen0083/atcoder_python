# https://atcoder.jp/contests/abc154/tasks/abc154_e


def main():
    n = int(input())
    k = int(input())
    count = 0
    if k == 1:
        t = n
        while t >= 10:
            t //= 10
            count += 9
        count += t
    if k == 2:
        t = n
        factor = 9
        while t >= 100:
            t //= 10
            count += factor * 9
            factor += 9
        count += t % 10
        t //= 10
        count += (t - 1) * 9
    print(count)


if __name__ == '__main__':
    main()
