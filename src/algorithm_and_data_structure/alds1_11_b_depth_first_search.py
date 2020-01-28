# 深さ優先探索
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_11_B&lang=jp


def main():
    n = int(input())
    data = [0] * n
    reached_memo = [[0, 0] for _ in range(n)]
    for _ in range(n):
        i, k, *v = map(int, input().split(" "))
        data[i - 1] = v
    stack = []
    go_set = set()
    return_set = set()
    cur = 1
    step = 0
    while len(go_set) < n or len(return_set) < n:
        if cur in go_set:
            # すでに訪問済み
            if cur not in return_set:
                step += 1
                reached_memo[cur - 1][1] = step
                return_set.add(cur)
            if len(stack) > 0:
                cur = stack.pop()
        else:
            stack.append(cur)
            v = data[cur - 1]
            for t in v[-1::-1]:
                stack.append(t)
            go_set.add(cur)
            step += 1
            reached_memo[cur - 1][0] = step
            cur = stack.pop()
    for i, line in enumerate(reached_memo, 1):
        print("%d %d %d" % (i, line[0], line[1]))


if __name__ == '__main__':
    main()
