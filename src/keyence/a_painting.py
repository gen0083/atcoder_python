# https://atcoder.jp/contests/keyence2020/tasks/keyence2020_a


def main():
    h = int(input())
    w = int(input())
    t = int(input())
    longer = max(h, w)
    shorter = min(h, w)
    num = t // longer
    if num * longer < t:
        num += 1
    print(num)


if __name__ == '__main__':
    main()
