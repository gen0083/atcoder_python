# マージソート
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_B&lang=jp


INFTY = 10 ** 9 + 1
count = 0


def merge(a, left, mid, right):
    global count
    n1 = mid - left
    n2 = right - mid
    l = [0] * (n1 + 1)
    r = [0] * (n2 + 1)
    for i in range(n1):
        l[i] = a[left + i]
    for i in range(n2):
        r[i] = a[mid + i]
    l[n1] = INFTY
    r[n2] = INFTY
    i = 0
    j = 0
    for k in range(left, right):
        count += 1
        if l[i] <= r[j]:
            a[k] = l[i]
            i += 1
        else:
            a[k] = r[j]
            j += 1


def merge_sort(a, left, right):
    if left + 1 < right:
        mid = (left + right) // 2
        merge_sort(a, left, mid)
        merge_sort(a, mid, right)
        merge(a, left, mid, right)


def main():
    n = int(input())
    s = [int(s) for s in input().split(" ")]
    global count
    merge_sort(s, 0, n)
    print(" ".join(map(str, s)))
    print(count)


if __name__ == '__main__':
    main()
