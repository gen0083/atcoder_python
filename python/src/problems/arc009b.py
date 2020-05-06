def main():
    b = [s for s in input().split(" ")]
    table = {}
    for i, x in enumerate(b):
        table[x] = str(i)
    n = int(input())
    a = [input() for _ in range(n)]
    gyaku = {}
    conv = []
    for e in a:
        i = int(e)
        ss = ""
        for x in e:
            ss += table[x]
        ii = int(ss)
        gyaku[ii] = i
        conv.append(ii)
    conv.sort()
    for e in conv:
        print(gyaku[e])


if __name__ == '__main__':
    main()
