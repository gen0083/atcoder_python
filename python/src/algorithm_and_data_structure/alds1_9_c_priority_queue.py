# 優先度付きキュー
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_9_C&lang=jp
import heapq
import sys


def main():
    # heapqは0インデックスでヒープアルゴリズムを実装してるので、普通の配列を使えばいい
    heap = []
    while True:
        command = sys.stdin.readline().split(" ")
        if command[0] == "insert":
            # なんでマイナスで入れてるかというと、heapqがmin-heapの実装だから
            # マイナスで変換してやれば最大の値がマイナスに反転して最小で並んでくれる
            heapq.heappush(heap, -int(command[1]))
        elif command[0] == "extract\n":
            # この方法を取る場合、popした際に符号の反転を忘れないように
            print(-heapq.heappop(heap))
        else:
            break


if __name__ == '__main__':
    main()
