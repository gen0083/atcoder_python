# https://atcoder.jp/contests/abc162/tasks/abc162_d
from collections import deque


def main():
    n = int(input())
    # これだとTLE
    # s = [s for s in input()]
    # count = 0
    # ps = ""
    # pc = 0
    # for j in range(1, n):
    #     if ps == s[j]:
    #         count += pc
    #         continue
    #     pc = 0
    #     for i in range(j - 1, -1, -1):
    #         if s[i] != s[j]:
    #             offset = j - i
    #             for k in range(j + 1, n):
    #                 if s[k] != s[j] and s[k] != s[i]:
    #                     if k - j != offset:
    #                         pc += 1
    #     count += pc
    # print(count)
    # これもTLEだけどちょっと効率いい
    s = deque()
    r = deque()
    g = deque()
    b = deque()
    for i, c in enumerate(input()):
        s.append(c)
        if c == "R":
            r.append(i)
        elif c == "G":
            g.append(i)
        else:
            b.append(i)
    if len(r) == 0 or len(g) == 0 or len(b) == 0:
        print(0)
        return
    count = 0
    t = []
    x = r
    for w in range(3):
        if w == 0:
            x = r
            t = [g, b]
        elif w == 1:
            x = g
            t = [r, b]
        else:
            x = b
            t = [r, g]
        for j in x:
            if s[j] == "R":
                t = [g, b]
            elif s[j] == "G":
                t = [r, b]
            else:
                t = [r, g]
            for z in range(2):
                for i in t[z]:
                    if i >= j:
                        break
                    offset = j - i
                    for num, k in enumerate(t[1 - z]):
                        if k <= j:
                            continue
                        if offset != k - j:
                            count += 1
                        if offset < k - j:
                            count += len(t[1 - z]) - num - 1
                            break
    print(count)


if __name__ == '__main__':
    main()
