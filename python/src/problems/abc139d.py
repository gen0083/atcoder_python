from math import ceil


def main():
    n = int(input()) - 1
    if n % 2 == 0:
        print(n * (n // 2) + n // 2)
    else:
        print(n * ceil(n / 2))


if __name__ == '__main__':
    main()
