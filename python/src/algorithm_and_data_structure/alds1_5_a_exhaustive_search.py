# 全探索
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_A&lang=jp


def main():
    n = int(input())
    a = [int(i) for i in input().split(" ")]
    m = int(input())
    q = [int(i) for i in input().split(" ")]
    bits = 1048575 >> (20 - n)
    pattern = set()
    for i in range(bits, 0, -1):
        sum = 0
        str_b = str(bin(i))[2:].zfill(n)
        index = [p for p, v in enumerate(str_b) if v == "1"]
        for t in index:
            sum += a[t]
        pattern.add(sum)
    for mi in q:
        print("yes" if mi in pattern else "no")


if __name__ == '__main__':
    main()
