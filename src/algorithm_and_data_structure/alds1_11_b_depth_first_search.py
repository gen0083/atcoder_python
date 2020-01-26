# 深さ優先探索
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_11_B&lang=jp
from collections import deque


def main():
    n = int(input())
    reached_memo = dict()
    # prepare data
    data = dict()
    data_keys = dict()
    for _ in range(n):
        i, k, *v = map(int, input().split(" "))
        if k == 0:
            v = deque([])
        data[i] = [i, deque(v)]
        reached_memo[i] = [0, 0]
    # depth first search
    step = 1
    stack = [data[1]]
    next_id = data[1][1].popleft()
    next_node = data[next_id]
    reached_memo[1][0] = step
    while len(stack) > 0 and len(next_node[1]) > 0:
        while len(next_node[1]) > 0:
            step += 1
            reached_memo[next_id][0] = step
            next_id = next_node[1].popleft()
            stack.append(next_node)
            next_node = data[next_id]
        next_node = stack.pop()
        next_id = next_node[0]
        if len(next_node[1]) == 0:
            step += 1
            reached_memo[next_id][1] = step
        else:
            next_id = next_node[1].popleft()
    for l in reached_memo:
        print(" ".join(map(str, reached_memo[l])))


if __name__ == '__main__':
    main()
