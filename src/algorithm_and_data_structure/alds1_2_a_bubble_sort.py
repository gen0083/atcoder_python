# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_2_A&lang=jp


def do_code():
    num = int(input())
    array = [int(i) for i in input().split(" ")]
    count = 0
    flag = True
    while flag:
        flag = False
        for i in range(num - 1, 0, -1):
            if array[i] < array[i - 1]:
                count += 1
                tmp = array[i]
                array[i] = array[i - 1]
                array[i - 1] = tmp
                flag = True
    print(" ".join(map(str, array)))
    print(count)


if __name__ == '__main__':
    do_code()
