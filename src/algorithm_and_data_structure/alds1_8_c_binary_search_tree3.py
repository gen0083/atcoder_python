# 二分探索木: 削除
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_8_C&lang=jp
import sys


class Node(object):
    def __init__(self, value, parent=None, left=None, right=None):
        self.value = value
        self.parent = parent
        self.left = left
        self.right = right


# noinspection DuplicatedCode
def insert(root, value):
    if root is None:
        return Node(value)
    if root.value > value:
        # rootより値が小さい場合は左ノードを探索
        if root.left is None:
            root.left = Node(value, root)
        else:
            insert(root.left, value)
    else:
        # rootより値が大きい場合は右ノードを探索
        if root.right is None:
            root.right = Node(value, root)
        else:
            insert(root.right, value)
    return root


# noinspection DuplicatedCode
def find(root, value):
    ret = None
    if root is None:
        return ret
    if root.value == value:
        ret = root
    elif root.value > value:
        ret = find(root.left, value)
    else:
        ret = find(root.right, value)
    return ret


# noinspection DuplicatedCode
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


def delete(root, value):
    node = find(root, value)
    if node is None:
        # 該当するキー存在しない場合
        return
    p = node.parent
    use_right = p.left is None or p.left.value != value
    if node.left is None and node.right is None:
        # 該当のキーが子を持たない場合
        if use_right:
            p.right = None
        else:
            p.left = None
    elif node.left is not None and node.right is not None:
        # 該当のキーが子を2つ保つ場合
        r = node.right
        l = node.left
        r.right = l
        r.parent = p
        if use_right:
            p.right = r
        else:
            p.left = r
    else:
        # 子が1つの場合
        if node.left is None:
            if use_right:
                p.right = node.right
                p.right.parent = p
            else:
                p.left = node.right
                p.left.parent = p
        else:
            if use_right:
                p.right = node.left
                p.right.parent = p
            else:
                p.left = node.left
                p.left.parent = p


def main():
    n = int(sys.stdin.readline())
    root = None
    for _ in range(n):
        command = sys.stdin.readline().split(" ")
        if command[0] == "insert":
            root = insert(root, int(command[1]))
        elif command[0] == "find":
            if find(root, int(command[1])) is None:
                print("no")
            else:
                print("yes")
        elif command[0] == "delete":
            delete(root, int(command[1]))
        else:
            print_tree(root)


def test():
    n = node(3)
    l = node(2, n)
    n.left = l
    t = n.left
    print(n.left)
    t = none
    print(n.left)


if __name__ == '__main__':
    # main()
    test()
