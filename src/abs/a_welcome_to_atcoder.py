def do_code():
    a = int(input())
    b, c = map(int, input().split(" "))
    s = input()
    print("%d %s" % (a + b + c, s))


if __name__ == '__main__':
    do_code()
