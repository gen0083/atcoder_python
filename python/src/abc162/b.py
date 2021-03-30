# https://atcoder.jp/contests/abc162/tasks/abc162_b


def main():
    n = int(input())
    total = 0
    for i in range(1, n + 1):
        if i % 5 == 0 or i % 3 == 0:
            continue
        else:
            total += i
    print(total)


if __name__ == '__main__':
    main()
