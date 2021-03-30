# パーティション
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_6_B&lang=jp


def partition(a, p, r):
    x = a[r]
    i = p - 1
    for j in range(p, r):
        if a[j] <= x:
            i += 1
            tmp = a[i]
            a[i] = a[j]
            a[j] = tmp
    tmp = a[i + 1]
    a[i + 1] = a[r]
    a[r] = tmp
    return i + 1


def main():
    n = int(input())
    array = [int(s) for s in input().split(" ")]
    p = partition(array, 0, n - 1)
    print(" ".join(map(str, array[:p])) + " [%d] " % array[p] + " ".join(map(str, array[p + 1:])))


if __name__ == '__main__':
    main()
