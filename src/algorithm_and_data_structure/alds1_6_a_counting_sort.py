# 計数ソート
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_6_A&lang=jp


def counting_sort(a, b, k):
    c = [0] * (k + 1)
    for j in a:
        c[j] += 1
    for i in range(1, k + 1):
        c[i] = c[i] + c[i - 1]
    for j in range(len(a) - 1, -1, -1):
        b[c[a[j]] - 1] = a[j]
        c[a[j]] -= 1


def main():
    n = int(input())
    array = [int(s) for s in input().split(" ")]
    b = [0] * n
    k = max(array)
    counting_sort(array, b, k)
    print(" ".join(map(str, b)))


if __name__ == '__main__':
    main()
