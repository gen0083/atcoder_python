# 優先度付きキュー
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_9_C&lang=jp
import sys


def insert(heap, value):
    # 末尾に追加して、その親との比較で必要があれば入れ替えを行う
    # 完全ヒープの構築まではする必要はない
    heap.append(value)
    i = len(heap) - 1
    while i > 1:
        p = i // 2
        if heap[p] < heap[i]:
            heap[0] = heap[p]
            heap[p] = heap[i]
            heap[i] = heap[0]
            i = p
        else:
            break


def extract(heap):
    v = heap[1]
    heap[1] = heap[-1]
    heap.pop()
    max_heapify(heap, 1)
    return v


def max_heapify(heap, root_index):
    left_index = root_index * 2
    right_index = left_index + 1
    max_index = root_index
    size = len(heap)
    if left_index < size and heap[left_index] > heap[root_index]:
        max_index = left_index
    if right_index < size and heap[right_index] > heap[max_index]:
        max_index = right_index
    if max_index != root_index:
        heap[0] = heap[root_index]
        heap[root_index] = heap[max_index]
        heap[max_index] = heap[0]
        max_heapify(heap, max_index)


def main():
    heap = [0]
    while True:
        command = sys.stdin.readline().split(" ")
        if command[0] == "insert":
            insert(heap, int(command[1]))
        elif command[0] == "extract\n":
            print(extract(heap))
        else:
            break


if __name__ == '__main__':
    main()
