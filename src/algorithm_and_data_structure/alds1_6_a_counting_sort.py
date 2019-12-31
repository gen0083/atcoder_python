# 計数ソート
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_6_A&lang=jp


def counting_sort(a, b, k):
    # cはaの配列に入っている要素をインデックスとしたカウンタ
    c = [0] * (k + 1)
    # まずは各要素の出現回数を単純にカウント
    for j in a:
        c[j] += 1
    # 次にc[i]がc[i]以下の要素の出現数になるように調整
    # つまり、c[i]が出力結果であるbのどのindexに入るのかを示すように変形している
    for i in range(1, k + 1):
        c[i] = c[i] + c[i - 1]
    for j in range(len(a) - 1, -1, -1):
        b[c[a[j]] - 1] = a[j]
        c[a[j]] -= 1
    print(c)


def main():
    n = int(input())
    array = [int(s) for s in input().split(" ")]
    b = [0] * n
    k = max(array)
    counting_sort(array, b, k)
    print(" ".join(map(str, b)))


if __name__ == '__main__':
    main()
