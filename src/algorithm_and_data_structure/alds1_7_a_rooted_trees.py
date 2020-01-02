# 根付きの木の表現
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_7_A&lang=jp
import sys


class Node(object):
    def __init__(self, node_id, children, parent):
        self.node_id = node_id
        self.parent = parent
        self.children = children

    def get_type(self):
        if self.parent.node_id == -1:
            return "root"
        elif len(self.children) > 0:
            return "internal node"
        else:
            return "leaf"

    def get_depth(self):
        has_parent = self.parent.node_id != -1
        t = self
        depth = 0
        while has_parent:
            depth += 1
            t = t.parent
            has_parent = t.parent.node_id != -1
        return depth

    def __str__(self):
        return "node %d: parent = %d, depth = %d, %s, %s" % \
               (self.node_id, self.parent.node_id, self.get_depth(), self.get_type(), self.children)


def main():
    """
    nodeのtypeは[root, internal node, leaf]のうちいずれかになる
    """
    num = int(sys.stdin.readline())
    nodes = [0] * num
    root = Node(-1, [], None)
    # Nodeを配列に用意する(この時点ではparentの情報とかはない)
    # Node0がrootとは限らないので、Node情報をnode_idをindexにした配列に確保する
    for _ in range(num):
        line = [int(s) for s in sys.stdin.readline().split(" ")]
        children = []
        if len(line) > 2:
            children = line[2:]
        node = Node(line[0], children, root)
        nodes[node.node_id] = node
    # 子Nodeに親Nodeをセットする
    for n in nodes:
        for c in n.children:
            nodes[c].parent = n
    # 配列のindexはnode_idになっているので、0から順番に出力する
    for n in nodes:
        print(n)


if __name__ == '__main__':
    main()
