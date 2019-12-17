# 選択ソート P65
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_2_B&lang=jp


def do_code():
    num = int(input())
    array = [int(i) for i in input().split(" ")]
    count = 0
    for i in range(num):
        minj = i
        for j in range(i, num):
            if array[j] < array[minj]:
                minj = j
        if minj != i:
            count += 1
            tmp = array[i]
            array[i] = array[minj]
            array[minj] = tmp
    print(" ".join(map(str, array)))
    print(count)


if __name__ == '__main__':
    do_code()
