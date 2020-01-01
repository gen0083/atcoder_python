# 反点数　バブルソートの交換回数と等しくなる
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_D&lang=jp
import math
import sys

count = 0
MAX_SIZE = 10 ** 9 + 1


def merge_sort(origin, left, right):
    """
    leftは配列の先頭のindex
    rightは配列の最終index + 1(要素数)
    """
    if left + 1 < right:
        mid = (left + right) // 2
        merge_sort(origin, left, mid)
        merge_sort(origin, mid, right)
        merge(origin, left, mid, right)


def merge(origin, left, mid, right):
    left_num = mid - left
    right_num = right - mid
    l = [v for v in origin[left:mid]]
    r = [v for v in origin[mid:right]]
    l.append(MAX_SIZE)
    r.append(MAX_SIZE)
    li = 0
    ri = 0
    global count
    for i in range(left, right):
        if l[li] < r[ri]:
            origin[i] = l[li]
            li += 1
        else:
            origin[i] = r[ri]
            ri += 1
            count += left_num - li


def main():
    # 悩んだけど分からなかったので解説見た
    n = int(input())
    array = [int(s) for s in input().split(" ")]
    global count
    count = 0
    # とりあえず2重ループ使ってる時点でダメO(n^2)のアルゴリズムではnが200000の制約下では無理
    merge_sort(array, 0, n)
    print(count)


if __name__ == '__main__':
    main()
