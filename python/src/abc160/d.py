# https://atcoder.jp/contests/abc160/tasks/abc160_d
# TODO: try to AC


def main():
    n, x, y = map(int, input().split(" "))
    # この問題はパスの計算式を考えるのがややこしい
    # そしてそういう問題が私は苦手だ
    break_point = (y - x - 1) // 2 + x
    short_count = y - x - 1
    for k in range(1, n):
        count = 0
        for i in range(1, n - k):
            j = i + k
            # xyを使って移動してのちYからまだ動ける距離
            temp = k - (x - i + 1)
            if j <= break_point:
                count += 1
            if temp > 0:
                # yから戻るパターン
                if j == y - temp:
                    count += 1
                elif j < y - temp:
                    count += 2
                else:
                    count += 1
                # yから進むパターン
                if y + temp < n:
                    count += 1
        print(count)


if __name__ == '__main__':
    main()
