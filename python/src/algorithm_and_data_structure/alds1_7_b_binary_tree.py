# 二分木の表現
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_7_B&lang=jp
import sys


def main():
    num = int(sys.stdin.readline())
    # -1がきたときに配列の最後の要素をつかうことで-1のときにスキップ処理をするためのifを書かなくて済む
    l = [-1] * (num + 1)
    r = [-1] * (num + 1)
    p = [-1] * (num + 1)
    sib = [-1] * (num + 1)
    for _ in range(num):
        node_id, left_id, right_id = map(int, sys.stdin.readline().split(" "))
        l[node_id] = left_id
        r[node_id] = right_id
        p[left_id] = node_id
        p[right_id] = node_id
        sib[left_id] = right_id
        sib[right_id] = left_id
    type = [""] * num
    deg = [0] * num
    depth = [0] * num
    height = [0] * num
    max_depth = 0
    for node_id in range(num):
        # typeを確定
        c = 0
        if l[node_id] != -1:
            c += 1
        if r[node_id] != -1:
            c += 1
        deg[node_id] = c
        if p[node_id] == -1:
            type[node_id] = "root"
        elif c == 0:
            type[node_id] = "leaf"
        else:
            type[node_id] = "internal node"
        d = 0
        t = p[node_id]
        has_parent = t != -1
        while has_parent:
            d += 1
            if height[t] < d:
                height[t] = d
            t = p[t]
            has_parent = t != -1
        depth[node_id] = d
        if max_depth < d:
            max_depth = d
    for i in range(num):
        print("node %d: parent = %d, sibling = %d, degree = %d, depth = %d, height = %d, %s" % \
              (i, p[i], sib[i], deg[i], depth[i], height[i], type[i]))


if __name__ == '__main__':
    main()
