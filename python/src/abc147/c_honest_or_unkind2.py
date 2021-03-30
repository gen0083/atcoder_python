from collections import deque


def do_code():
    num = int(input())
    matrix = [[2] * (num + 1) for _ in range(num + 1)]
    honests = [set() for _ in range(num + 1)]
    unkinds = [set() for _ in range(num + 1)]
    # 人iは1〜Nのためインデックス0は使わずに1~Nで使うようにする
    for n in range(1, num + 1):
        u = set()
        h = set()
        ans = int(input())
        for a in range(ans):
            x, y = map(int, input().split(" "))
            if y == 1:
                h.add(x)
            else:
                u.add(x)
        honests[n] = h
        unkinds[n] = u
    count = 0
    for n in range(1, 2 ** num):
        honest_set = set()
        for j in range(num):
            t = 2 ** j
            if n & t == t:
                honest_set.add(j + 1)
        th = set()
        tu = set()
        queue = deque(honest_set)
        visited = set()
        while len(queue) > 0:
            t = queue.popleft()
            if t in visited:
                continue
            visited.add(t)
            queue.extend(honests[t])
            th |= honests[t]
            tu |= unkinds[t]
        if not th.isdisjoint(tu):
            # 正直者と仮定した人の証言を集めた場合にhonest && unkindな人がいる＝矛盾
            continue
        if not honest_set.isdisjoint(tu):
            continue
        honest = max(len(th), len(honest_set))
        count = max(count, honest)
    print(count)


if __name__ == '__main__':
    do_code()
