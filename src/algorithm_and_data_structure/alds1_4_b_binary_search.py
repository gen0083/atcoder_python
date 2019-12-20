# 二分探索
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_B&lang=jp


def main():
    n = int(input())
    S = [int(i) for i in input().split(" ")]
    q = int(input())
    T = [int(i) for i in input().split(" ")]
    count = 0
    for t in T:
        bottom = 0
        top = n - 1
        while 0 <= bottom <= top < n:
            c = (top + bottom) // 2
            if S[c] == t:
                count += 1
                break
            else:
                if S[c] > t:
                    top = c - 1
                else:
                    bottom = c + 1
    print(count)


if __name__ == '__main__':
    main()
