#


def main():
    k, n = map(int, input().split(" "))
    a = [int(s) for s in input().split(" ")]
    max_distance = a[0] + k - a[-1]
    p = 0
    for t in a:
        if t - p > max_distance:
            max_distance = t - p
        p = t
    print(k - max_distance)


if __name__ == '__main__':
    main()
