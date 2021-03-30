def do_code():
    num, target = map(int, input().split(" "))
    flg = False
    for man in range(num, -1, -1):
        if flg:
            break
        for gosen in range(num - man, -1, -1):
            if man * 10000 + gosen * 5000 + (num - man - gosen) * 1000 == target:
                print("%d %d %d" % (man, gosen, num - man - gosen))
                flg = True
                break
    if not flg:
        print("-1 -1 -1")


if __name__ == '__main__':
    do_code()
