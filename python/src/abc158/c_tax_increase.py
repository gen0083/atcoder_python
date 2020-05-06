# https://atcoder.jp/contests/abc158/tasks/abc158_c


import math


def main():
    a, b = map(int, input().split(" "))
    # eight = a // 0.08
    # ten = b // 0.1
    # print("%d %d" % (eight, ten))
    # if eight == ten:
    #     print("%d" % eight)
    # else:
    #     print("-1")
    for i in range(1, 1001):
        eight = math.floor(i * 0.08)
        ten = math.floor(i * 0.1)
        if eight == a and ten == b:
            print(i)
            return
    print("-1")


if __name__ == '__main__':
    main()
