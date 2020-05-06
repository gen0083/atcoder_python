def main():
    n, p = map(int, input().split())
    s = input()
    count = 0
    for i in range(n):
        for j in range(i, n):
            t = int(s[i: j + 1])
            if t % p == 0:
                count += 1
    print(count)


if __name__ == '__main__':
    main()
