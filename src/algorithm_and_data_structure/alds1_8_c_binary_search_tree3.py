# 二分探索木: 削除
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_8_C&lang=jp
import sys


class Node(object):
    def __init__(self, value, parent=None, left=None, right=None):
        self.value = value
        self.parent = parent
        self.left = left
        self.right = right

    def has_child(self):
        return self.left is not None or self.right is not None

    def __str__(self):
        return "Node(%d)[left=%s, right=%s]" % (self.value, self.left, self.right)


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
    if root is None:
        print("no")
        return
    if root.value == value:
        print("yes")
    elif root.value > value:
        find(root.left, value)
    else:
        find(root.right, value)


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
    if root is None:
        return
    else:
        if root.value == value:
            if root.parent.left == root:
                root.parent.left = None
            else:
                root.parent.right = None
    stack = []
    cur = root
    target_node = None
    next_node = None
    found_key = False
    while cur is not None or len(stack) > 0 and next_node is None:
        while cur is not None:
            stack.append(cur)
            cur = cur.left
        cur = stack.pop()
        if found_key:
            next_node = cur
        if cur.value == value:
            target_node = cur
            found_key = True
        cur = cur.right
    if target_node is None:
        return
    if target_node.has_child():
        p = target_node.parent
        if target_node.left is None:
            if p.left == target_node:
                p.left = target_node.right
                target_node.right.parent = p
            else:
                p.right = target_node.right
                target_node.right.parent = p
        elif target_node.right is None:
            if p.left == target_node:
                p.left = target_node.left
                target_node.left.parent = p
            else:
                p.right = target_node.left
                target_node.left.parent = p
        else:
            # 子が2つの場合
            target_node.value = next_node.value
            delete(next_node, next_node.value)
    else:
        p = target_node.parent
        if p.left == target_node:
            p.left = None
        else:
            p.right = None


def main():
    n = int(sys.stdin.readline())
    root = None
    for _ in range(n):
        command = sys.stdin.readline().split(" ")
        if command[0] == "insert":
            root = insert(root, int(command[1]))
        elif command[0] == "find":
            find(root, int(command[1]))
        elif command[0] == "delete":
            delete(root, int(command[1]))
        else:
            print_tree(root)


if __name__ == '__main__':
    main()
