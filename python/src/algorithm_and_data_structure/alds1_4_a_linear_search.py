# 線形探索
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_A&lang=jp


def main():
    n = int(input())
    S = [i for i in input().split(" ")]
    q = int(input())
    T = [i for i in input().split(" ")]
    count = 0
    for t in T:
        for s in S:
            if s == t:
                count += 1
                break
    print(count)


if __name__ == '__main__':
    main()
