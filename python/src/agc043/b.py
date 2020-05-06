# https://atcoder.jp/contests/agc043/tasks/agc043_b


def main():
    n = int(input())
    a = input()
    array = list(map(int, a))
    # 普通にやるとこうなるが、これだとTLE
    # for i in range(1, n):
    #     for j in range(n - i):
    #         array[j] = abs(array[j] - array[j + 1])
    # これはテストケース通らない
    # px = 0
    # for i in range(n - 1, 0, -1):
    #     x = abs(array[i] - array[i - 1])
    #     px = abs(px - x)
    for i in range(n - 1, 0, -1):
        tmp = [0] * i
        j = 0
        k = i
        while j < k:
            tmp[j] = abs(array[j] - array[j + 1])
            tmp[k] = abs(array[k] - array[k - 1])
            j += 1
            k -= 1
        array = tmp
    print(array[0])


if __name__ == '__main__':
    main()
