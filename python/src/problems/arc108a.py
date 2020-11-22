def main():
    n, m = map(int, input().split(" "))
    i = 1
    while i * i <= m:
        if m % i == 0:
            t = m // i
            if t + i == n:
                print("Yes")
                return
        i += 1
    print("No")


if __name__ == '__main__':
    main()
