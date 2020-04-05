# https://atcoder.jp/contests/abc161/tasks/abc161_b


def main():
    n, m = map(int, input().split(" "))
    a = [int(s) for s in input().split(" ")]
    total = sum(a)
    lim = total / (4 * m)
    a = sorted(a, reverse=True)
    count = 0
    for i in a:
        if i >= lim:
            count += 1
        else:
            break
    if count >= m:
        print("Yes")
    else:
        print("No")


if __name__ == '__main__':
    main()
