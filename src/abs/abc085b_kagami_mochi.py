def do_code():
    num = int(input())
    mochi = {}
    count = 0
    for _ in range(num):
        d = int(input())
        if d not in mochi:
            mochi[d] = True
            count += 1
    print(count)


if __name__ == '__main__':
    do_code()
