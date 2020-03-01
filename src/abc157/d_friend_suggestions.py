import sys


def main():
    n, m, k = map(int, input().split(" "))
    array = [0] * n
    for _ in range(m):
        i, j = map(int, sys.stdin.readline().strip().split(" "))
        array[i - 1] += 1
        array[j - 1] += 1
    for _ in range(k):
        i, j = map(int, sys.stdin.readline().strip().split(" "))
        array[i - 1] += 1
        array[j - 1] += 1
    ans = map(lambda i: str(n - 1 - i), array)
    print(" ".join(ans))


if __name__ == '__main__':
    main()
