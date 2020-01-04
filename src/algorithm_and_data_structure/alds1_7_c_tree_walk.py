# 木の巡回　P198
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_7_C&lang=jp
import sys


class Node(object):
    def __init__(self, node_id, left_node=None, right_node=None):
        self.node_id = node_id
        self.left = left_node
        self.right = right_node

    def __str__(self):
        return "Node[%d: l:%s r:%s]" % (self.node_id, self.left, self.right)


def traversal(node, preorder, inorder, postorder):
    preorder.append(node.node_id)
    if node.left is not None:
        traversal(node.left, preorder, inorder, postorder)
    inorder.append(node.node_id)
    if node.right is not None:
        traversal(node.right, preorder, inorder, postorder)
    postorder.append(node.node_id)


def main():
    num = int(sys.stdin.readline())
    nodes = [None] * (num + 1)
    p = [-1] * (num + 1)
    # 二分木の入力データが意地悪なので対応がめんどい
    # node_id=0がrootとは限らないし、ツリーの順番にデータが与えられるとも限らない
    for i in range(num):
        node_id, left_id, right_id = map(int, sys.stdin.readline().split(" "))
        node = nodes[node_id]
        left_node = nodes[left_id]
        right_node = nodes[right_id]
        p[left_id] = node_id
        p[right_id] = node_id
        if left_node is None and left_id != -1:
            left_node = Node(left_id)
            nodes[left_id] = left_node
        if right_node is None and right_id != -1:
            right_node = Node(right_id)
            nodes[right_id] = right_node
        if node is None:
            node = Node(node_id)
        node.left = left_node
        node.right = right_node
        nodes[node_id] = node
    preorder = []
    inorder = []
    postorder = []
    root_node = nodes[p[:-1].index(-1)]
    traversal(root_node, preorder, inorder, postorder)
    print("Preorder")
    sys.stdout.write(" ")
    sys.stdout.write(" ".join(map(str, preorder)))
    sys.stdout.write("\n")
    print("Inorder")
    sys.stdout.write(" ")
    sys.stdout.write(" ".join(map(str, inorder)))
    sys.stdout.write("\n")
    print("Postorder")
    sys.stdout.write(" ")
    sys.stdout.write(" ".join(map(str, postorder)))
    sys.stdout.write("\n")


if __name__ == '__main__':
    main()
