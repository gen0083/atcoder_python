# 木巡回の応用:木の復元
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_7_D&lang=jp
from collections import deque


def convert_postorder(index, preorder, inorder, postorder):
    if len(preorder) == 0:
        return
    root = preorder[index]
    half_index = inorder.index(root)
    if half_index == -1:
        postorder.append(root)
        return
    left_nodes = inorder[:half_index]
    if len(left_nodes) > 1:
        convert_postorder(index + 1, preorder, left_nodes, postorder)
    elif len(left_nodes) == 1:
        left = left_nodes[0]
        postorder.append(left)
    right_nodes = inorder[half_index + 1:]
    if len(right_nodes) > 1:
        # indexをベースにしないと、再帰中は右部分木でhalfを探すので、preorderのrootのindexが考慮されなくなる
        convert_postorder(index + half_index + 1, preorder, right_nodes, postorder)
    elif len(right_nodes) == 1:
        right = right_nodes[0]
        postorder.append(right)
    postorder.append(root)


def main():
    num = int(input())
    preorder = [int(s) for s in input().split(" ")]
    inorder = [int(s) for s in input().split(" ")]
    postorder = []
    convert_postorder(0, preorder, inorder, postorder)
    print(" ".join(map(str, postorder)))


if __name__ == '__main__':
    main()
