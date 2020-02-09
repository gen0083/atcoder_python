# https://atcoder.jp/contests/abc154/tasks/abc154_c


def main():
    n = int(input())
    data = set()
    for i in input().split(" "):
        if i in data:
            print("NO")
            return
        data.add(i)
    print("YES")


if __name__ == '__main__':
    main()
