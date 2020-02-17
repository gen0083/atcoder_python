# https://atcoder.jp/contests/abc155/tasks/abc155_d


def main():
    n, k = map(int, input().split(" "))
    M = []
    Z = []
    P = []
    for s in input().split(" "):
        i = int(s)
        if i == 0:
            Z.append(i)
        elif i < 0:
            M.append(i)
        else:
            P.append(i)
    m = len(M)
    z = len(Z)
    p = len(P)
    minus_range = m * p
    zero_range = (m * z) + (p * z) + (z * (z - 1) // 2)
    plus_range = (m * (m - 1) / 2) + (p * (p - 1) // 2)
    if k <= minus_range:
        # only M * P
        array = []
        for i in M:
            for j in P:
                array.append(i * j)
        array.sort()
        print(array[k - 1])
    elif k <= minus_range + zero_range:
        print("0")
    else:
        # only M * M and P * P
        array = []
        for i in range(m - 1):
            for j in range(i + 1, m):
                array.append(M[i] * M[j])
        for i in range(p - 1):
            for j in range(i + 1, p):
                array.append(P[i] * P[j])
        array.sort()
        print(array[k - minus_range - zero_range - 1])


if __name__ == '__main__':
    main()
