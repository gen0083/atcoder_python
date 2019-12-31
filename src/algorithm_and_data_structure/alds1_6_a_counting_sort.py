# 計数ソート
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_6_A&lang=jp


def counting_sort(a, b, k):
    c = {i: 0 for i in range(k + 1)}
    for i in a:
        c[i] += 1
    index = 0
    # pythonでkeys()はkeyの登録された順番になるので、0から順番に登録してればこれで照準で出力できる
    for key in c.keys():
        for vv in range(c[key]):
            b[index] = key
            index += 1


def main():
    n = int(input())
    array = [int(s) for s in input().split(" ")]
    b = [0] * n
    k = max(array)
    counting_sort(array, b, k)
    print(" ".join(map(str, b)))


if __name__ == '__main__':
    main()
