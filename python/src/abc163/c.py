# https://atcoder.jp/contests/abc163/tasks/abc163_c


def main():
    n = int(input())
    s = [int(s) for s in input().split(" ")]
    buka = {}
    for i in s:
        if i in buka:
            buka[i] += 1
        else:
            buka[i] = 1
    for i in range(n):
        if i + 1 in buka:
            print(buka[i + 1])
        else:
            print("0")


if __name__ == '__main__':
    main()
