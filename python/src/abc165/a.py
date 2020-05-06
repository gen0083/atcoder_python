# https://atcoder.jp/contests/abc165/tasks/abc165_a


def main():
    k = int(input())
    a, b = map(int, input().split(" "))
    for i in range(a, b + 1, 1):
        if i % k == 0:
            print("OK")
            return
    print("NG")


if __name__ == '__main__':
    main()
