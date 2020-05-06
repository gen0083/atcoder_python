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
    if root.value == value:
        if root.has_child():
            p = root.parent
            if root.left is None:
                # 子があってleftがNone=rightに子がある
                if p.left == root:
                    p.left = root.right
                    root.right.parent = p
                else:
                    p.right = root.right
                    root.right.parent = p
            elif root.right is None:
                # 子があってrightがNone=leftのみに子がある
                if p.left == root:
                    p.left = root.left
                    root.left.parent = p
                else:
                    p.right = root.left
                    root.left.parent = p
            else:
                # 子が2つの場合
                next_node = root.parent
                stack = []
                found_value = False
                while next_node is not None or len(stack) > 0:
                    while next_node is not None:
                        stack.append(next_node)
                        next_node = next_node.left
                    next_node = stack.pop()
                    if found_value:
                        break
                    if next_node.value == value:
                        found_value = True
                    next_node = next_node.right
                root.value = next_node.value
                delete(next_node, next_node.value)
        else:
            if root.parent.left == root:
                root.parent.left = None
            else:
                root.parent.right = None
    elif root.value > value:
        delete(root.left, value)
    else:
        delete(root.right, value)


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
