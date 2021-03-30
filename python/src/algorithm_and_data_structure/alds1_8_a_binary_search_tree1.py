# 二分探索木: 挿入
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_8_A&lang=jp
import sys


class Node(object):
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


def insert(root, v):
    if root is None:
        root = Node(v)
    else:
        if root.value > v:
            # insert into left
            if root.left is None:
                root.left = Node(v)
            else:
                insert(root.left, v)
        else:
            if root.right is None:
                root.right = Node(v)
            else:
                insert(root.right, v)
    return root


def print_node(root_node):
    t = root_node
    stack = []
    preorder = []
    inorder = []
    while t is not None or len(stack) > 0:
        while t is not None:
            stack.append(t)
            preorder.append(t.value)
            t = t.left
        t = stack.pop()
        inorder.append(t.value)
        t = t.right
    sys.stdout.write(" ")
    print(" ".join(map(str, inorder)))
    sys.stdout.write(" ")
    print(" ".join(map(str, preorder)))


def main():
    num = int(sys.stdin.readline())
    root_node = None
    for _ in range(num):
        command = sys.stdin.readline().split(" ")
        if command[0] == "insert":
            root_node = insert(root_node, int(command[1]))
        else:
            print_node(root_node)


if __name__ == '__main__':
    main()
