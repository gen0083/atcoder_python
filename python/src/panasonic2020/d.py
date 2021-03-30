# https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_d


def main():
    n = int(input())
    data = [chr(ord("a") + i) for i in range(10)]
    generate("a", 0, n, data)


def generate(cur, max_i, n, data):
    if len(cur) == n:
        print(cur)
        return
    for i in range(max_i + 2):
        generate(cur + chr(ord("a") + i), max(max_i, i), n, data)


if __name__ == '__main__':
    main()
