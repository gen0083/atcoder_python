from collections import deque


def main():
    n, m = map(int, input().split(" "))
    # O(NM)？だからデータ件数増えればTLEになるわな
    # q = deque(range(1, n + 1))
    # for _ in range(m):
    #     i = int(input())
    #     q.remove(i)
    #     q.appendleft(i)
    # for i in q:
    #     print(i)
    # O(N+M)になった、スタック形式にして出現した番号を記憶していって重複したらスキップ
    # あとは出現してない番号を1から順にnまで出力すればおけ
    q = deque()
    for _ in range(m):
        i = int(input())
        q.append(i)
    appear = set()
    while len(q) > 0:
        i = q.pop()
        if i not in appear:
            print(i)
            appear.add(i)
    for i in range(1, n + 1):
        if i not in appear:
            print(i)


if __name__ == '__main__':
    main()
