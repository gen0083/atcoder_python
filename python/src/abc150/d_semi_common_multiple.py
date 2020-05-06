# https://atcoder.jp/contests/abc150/tasks/abc150_d
# TODO: try


def main():
    n, m = map(int, input().split(" "))
    array = {int(s) for s in input().split(" ")}
    count = 0
    for i in range(m, 0, -1):
        has = 0
        for j in range(1, n + 1):
            for s in array:
                if s % (j + 0.5) == 0:
                    has += 1
        if has == 3:
            count += 1
    print(count)


if __name__ == '__main__':
    main()
