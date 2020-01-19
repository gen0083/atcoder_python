def main():
    n = int(input())
    count = 0
    for i in range(1, n + 1):
        p = i // 10
        tmp = str(i)
        if tmp[0] == tmp[-1]:
            count += (2 * p) + 1
    print(count)


if __name__ == '__main__':
    main()
