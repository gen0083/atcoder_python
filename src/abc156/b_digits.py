# https://atcoder.jp/contests/abc156/tasks/abc156_b


def main():
    n, k = map(int, input().split(" "))
    count = 1
    c = n // k
    while c > 0:
        c = c // k
        count += 1
    print(count)


if __name__ == '__main__':
    main()
