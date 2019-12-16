def do_code():
    num, target = map(int, input().split(" "))
    a_p = [1, 2, 6, 10]
    b_p = [1, 5]
    a = target // 10000
    b = target % 10000 // 5000
    c = target % 5000 // 1000
    default = [0, 0, c]
    for ai in range(a, 0, -1):
        sum(a_p)
    print()


if __name__ == '__main__':
    do_code()
