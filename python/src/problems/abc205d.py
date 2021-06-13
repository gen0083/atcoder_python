import bisect


def main():
    n, q = map(int, input().split(" "))
    a = [int(s) for s in input().split(" ")]
    minimum = a[0]
    maximum = a[-1]
    for i in range(q):
        k = int(input())
        if k < minimum:
            print(k)
        elif k > maximum:
            print(k + n)
        else:
            p = bisect.bisect(a, k)
            index = bisect.bisect(a, k + p)
            while p != index:
                p = index
                index = bisect.bisect(a, k + p)
            print(k + p)


if __name__ == '__main__':
    main()
