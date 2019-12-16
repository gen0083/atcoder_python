def do_code():
    num = int(input())
    matrix = [[None] * num for _ in range(num)]
    for n in range(num):
        ans = int(input())
        for a in range(ans):
            x, y = map(int, input().split(" "))
            matrix[n][x-1] = y
    count = 0
    for m in matrix:
        if 1 in m:
            count += 1
    print(count)


if __name__ == '__main__':
    do_code()
