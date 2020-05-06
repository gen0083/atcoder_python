# https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_d


def main():
    n = int(input())
    data = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j"]
    array = [0] * n
    for i in range(1, n):
        initial = "a" * (n - i)
        for j in range(i):
            tmp = j
            while tmp > 0:
                a = tmp % i
                tmp -= a
    print("".join(initial[0]))


if __name__ == '__main__':
    main()
