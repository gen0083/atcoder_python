# https://atcoder.jp/contests/abc161/tasks/abc161_d
from collections import deque


def main():
    k = int(input())
    lun = deque(["1", "2", "3", "4", "5", "6", "7", "8", "9"])
    keta = 0
    while len(lun) <= k:
        keta += 1
        for i in range(1, 10):
            generate_lunlun(lun, "", i, keta)
    print(lun[k - 1])


def generate_lunlun(array, s, c, keta):
    if keta == 0:
        array.append(s + str(c))
        return
    if c > 0:
        generate_lunlun(array, s + str(c), c - 1, keta - 1)
    generate_lunlun(array, s + str(c), c, keta - 1)
    if c < 9:
        generate_lunlun(array, s + str(c), c + 1, keta - 1)


if __name__ == '__main__':
    main()
