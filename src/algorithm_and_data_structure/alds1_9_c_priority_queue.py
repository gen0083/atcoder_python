# 優先度付きキュー
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_9_C&lang=jp
import sys
from collections import deque


def insert(heap, value):
    heap.appendleft(value)
    heap[1] = heap[0]
    max_heapify(heap, 1)


def extract(heap):
    v = heap[1]
    heap[1] = heap[0]
    heap.popleft()
    satisfy_max_heap(heap)
    return v


def satisfy_max_heap(heap):
    for i in range(len(heap) // 2, 0, -1):
        max_heapify(heap, i)


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
    heap = deque([0])
    while True:
        command = sys.stdin.readline().split(" ")
        if command[0] == "insert":
            insert(heap, int(command[1]))
        elif command[0] == "extract\n":
            print(str(extract(heap)))
        else:
            break


if __name__ == '__main__':
    main()
