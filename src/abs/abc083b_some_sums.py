def do_code():
    n, a, b = map(int, input().split(" "))
    total = 0
    for i in range(1, n + 1):
        i10000 = int(i / 10**4)
        i1000 = int((i % 10**4) / 10**3)
        i100 = int((i % 10**3) / 10**2)
        i10 = int((i % 10**2) / 10**1)
        i1 = int(i % 10)
        sum = i10000 + i1000 + i100 + i10 + i1
        if a <= sum <= b:
            total += i
    print(total)


if __name__ == '__main__':
    do_code()
