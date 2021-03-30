# 挿入ソート P54
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_1_A&lang=jp


def do_code():
    num = int(input())
    array = [int(i) for i in input().split(" ")]
    print_array(array)
    for i in range(1, num):
        v = array[i]
        j = i - 1
        while j >= 0 and array[j] > v:
            array[j + 1] = array[j]
            j -= 1
        array[j + 1] = v
        print_array(array)


def print_array(array):
    print(" ".join(map(str, array)))


if __name__ == '__main__':
    do_code()
