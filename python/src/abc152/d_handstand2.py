def main():
    n = int(input())
    count = 0
    m = dict()
    for i in range(1, n + 1):
        tmp = str(i)
        t = (tmp[0], tmp[-1])
        if t in m:
            m[t] += 1
        else:
            m[t] = 1
    for i in range(1, n + 1):
        tmp = str(i)
        t = (tmp[-1], tmp[0])
        if t in m:
            count += m[t]
    print(count)


if __name__ == '__main__':
    main()
