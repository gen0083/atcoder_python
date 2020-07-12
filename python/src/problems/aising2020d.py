def main():
    n = int(input())
    x = input()
    initial_value = 0
    digit = [0 for _ in range(n)]
    fac = 1
    for i in range(n):
        digit[n - i - 1] = fac
        if x[n - i - 1] == '1':
            initial_value += fac
        fac *= 2
    print(digit)


if __name__ == '__main__':
    main()
