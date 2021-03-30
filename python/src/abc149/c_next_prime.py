# https://atcoder.jp/contests/abc149/tasks/abc149_c


def is_prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True


def main():
    n = int(input())
    for i in range(n, 100004):
        if is_prime(i):
            print(i)
            break


if __name__ == '__main__':
    main()
