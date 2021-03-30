# 二分探索木: 探索
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_8_B&lang=jp
import sys


class Node(object):
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


# noinspection DuplicatedCode
def insert(root, value):
    if root is None:
        return Node(value)
    if root.value > value:
        # rootより値が小さい場合は左ノードを探索
        if root.left is None:
            root.left = Node(value)
        else:
            insert(root.left, value)
    else:
        # rootより値が大きい場合は右ノードを探索
        if root.right is None:
            root.right = Node(value)
        else:
            insert(root.right, value)
    return root


def find(root, value):
    if root is None:
        print("no")
        return
    if root.value == value:
        print("yes")
        return
    if root.value > value:
        find(root.left, value)
    else:
        find(root.right, value)


def print_tree(root):
    preorder = []
    inorder = []
    stack = []
    t = root
    while t is not None or len(stack) > 0:
        while t is not None:
            preorder.append(str(t.value))
            stack.append(t)
            t = t.left
        t = stack.pop()
        inorder.append(str(t.value))
        t = t.right
    sys.stdout.write(" ")
    print(" ".join(inorder))
    sys.stdout.write(" ")
    print(" ".join(preorder))


def main():
    n = int(sys.stdin.readline())
    root = None
    for _ in range(n):
        command = sys.stdin.readline().split(" ")
        if command[0] == "insert":
            root = insert(root, int(command[1]))
        elif command[0] == "find":
            find(root, int(command[1]))
        else:
            print_tree(root)


if __name__ == '__main__':
    main()
