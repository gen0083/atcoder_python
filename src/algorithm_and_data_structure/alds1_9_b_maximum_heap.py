# 最大・最小ヒープ
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_9_B&lang=jp
import sys


def max_heapify(array, root_index):
    left_index = root_index * 2
    right_index = left_index + 1
    max_index = root_index
    # 検索対象となっている節において最も大きい値をルートとする
    if left_index < len(array) and array[left_index] > array[root_index]:
        max_index = left_index
    # なのでrightと比較するのはleftとrootのうち大きい方と比較する
    # そうしないとleft > right > rootの場合にrightがrootにきてしまい、最大ヒープの条件を満たさない
    # (新たなrootとなるものよりleftの方が大きいので条件を満たさなくなる)
    if right_index < len(array) and array[right_index] > array[max_index]:
        max_index = right_index
    if max_index != root_index:
        array[0] = array[root_index]
        array[root_index] = array[max_index]
        array[max_index] = array[0]
        max_heapify(array, max_index)


def main():
    n = int(input())
    array = [int(s) for s in input().split(" ")]
    heap = [0, *array]
    for i in range((n + 1) // 2, 0, -1):
        max_heapify(heap, i)
    sys.stdout.write(" ")
    print(" ".join(map(str, heap[1:])))


if __name__ == '__main__':
    main()
