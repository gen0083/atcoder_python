def do_code():
    FLOOR = 10 ** 9 + 7
    num = int(input())
    table = [int(i) for i in input().split(" ")]
    sum = 0
    for i in range(len(table) - 1):
        for j in range(i, len(table)):
            sum += table[i] ^ table[j]
    print(sum % FLOOR)


if __name__ == '__main__':
    do_code()
