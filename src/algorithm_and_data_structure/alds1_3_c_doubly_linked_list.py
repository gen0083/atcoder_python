# 連結リスト P95
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_3_C&lang=jp
from collections import deque


# TODO: 余裕があったら自前実装もやる、ただあんまり意味ないかもなぁ
def main():
    linked_list = deque()
    num = int(input())
    for _ in range(num):
        command = input().split(" ")
        if command[0] == "insert":
            linked_list.appendleft(command[1])
        elif command[0] == "delete":
            try:
                linked_list.remove(command[1])
            except ValueError:
                continue
        elif command[0] == "deleteFirst":
            linked_list.popleft()
        else:
            linked_list.pop()
    print(" ".join(linked_list))


if __name__ == '__main__':
    main()
