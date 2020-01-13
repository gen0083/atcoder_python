# https://atcoder.jp/contests/abc150/tasks/abc150_c
# TODO: try


def main():
    n = int(input())
    array_a = [int(s) for s in input().split(" ")]
    array_b = [int(s) for s in input().split(" ")]
    if array_a == array_b:
        print("0")
        return
    a = 0
    b = 0
    for i in range(n):
        a += get_num(array_a, i, n)
        b += get_num(array_b, i, n)

    print(abs(a - b))


def get_num(array, i, n):
    t = abs(array[i - 1] - (i - 1))
    t = t ** (n - i -1)
    return t


if __name__ == '__main__':
    main()
