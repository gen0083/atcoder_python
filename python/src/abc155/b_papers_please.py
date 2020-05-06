# https://atcoder.jp/contests/abc155/tasks/abc155_b


def main():
    n = int(input())
    a = [int(s) for s in input().split(" ")]
    for v in a:
        if v % 2 == 0:
            if v % 3 != 0 and v % 5 != 0:
                print("DENIED")
                return
    print("APPROVED")


if __name__ == '__main__':
    main()
