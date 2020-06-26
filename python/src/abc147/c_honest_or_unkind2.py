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
    for j in range(1, num + 1):
        # 1~Nまで順番に1人ずつ正直者であると仮定して、他の組み合わせすべてを試す
        u = unkinds[j]
        h = honests[j]
        contradiction = True
        # jを除く各人について、正直者であると仮定したときに矛盾が生じるかどうかをチェックする
        for i in range(1, num + 1):
            if i == j:
                continue
            tu = set()
            th = set()
            th.add(i)
            isOk = True
            queue = deque(honests[i])
            visited = {i}
            while len(queue) > 0:
                t = queue.popleft()
                if t in visited:
                    continue
                visited.add(t)
                if t in th or t in h:
                    continue
                if t in tu or t in u:
                    # 現在の仮定と矛盾するため、人物iをhonestと仮定できない
                    isOk = False
                    break
                queue.extend(honests[t])
                th |= honests[t]
                tu |= unkinds[t]
            if not isOk:
                continue
            for unkind in unkinds[i]:
                # iを正直者と仮定するため、unkindと証言している人物はunkindであると仮定する
                # ただし現在の仮定と矛盾する場合は人物iをhonestとすると矛盾が生じる
                # unkindについてはunkindと証言されている人物の発言までチェックする必要はない
                if unkind not in th and unkind not in h:
                    tu.add(unkind)
                else:
                    isOk = False
                    break
            if isOk:
                contradiction = False
                h |= th
                u |= tu
        if not contradiction:
            count = max(count, len(h))
    print(count)


if __name__ == '__main__':
    do_code()
