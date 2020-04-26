# https://atcoder.jp/contests/abc164/tasks/abc164_c


def main():
    n = int(input())
    items = set()
    for _ in range(n):
        items.add(input())
    print(len(items))


if __name__ == '__main__':
    main()
