# ハッシュ
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_C&lang=jp
import sys


def main():
    n = int(input())
    dic = set()
    for _ in range(n):
        command = sys.stdin.readline().split(" ")
        if command[0] == "insert":
            dic.add(command[1])
        else:
            if command[1] in dic:
                print("yes")
            else:
                print("no")


if __name__ == '__main__':
    main()
