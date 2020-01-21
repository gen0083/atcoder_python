# 連鎖行列積
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_10_B&lang=jp
# TODO: 解説コード丸写し、理解しやすいようにコードを書き換えてみる
# なにが難しいって言うと、Mとpの変換の部分がややこしいと思うんだよね
# 変数の意味も味気ないから読みづらいし
# しかしこれ、mのテーブルの領域使用率低すぎるな・・・


def main():
    n = int(input())
    if n == 1:
        print(0)
        return
    # これもっとスマートに変換できんかな
    p = input().split(" ")
    p += [input().split(" ")[1] for i in range(n - 1)]
    p = [int(s) for s in p]
    # for i in range(n):
    #     r, c = input().split(" ")
    #     if i == 0:
    #         p.append(int(r))
    #         p.append(int(c))
    #     else:
    #         p.append(int(c))
    m = [[0] * (n + 1) for _ in range(n + 1)]
    m[1][2] = 3
    # まず隣同士の行列を計算していく（M12, M23, M34, M45...これは計算するパターンは1パターンしか存在しない）
    # 計算するパターンがkということか
    # lはMの乗算をする範囲を広げると同時に、iの移動範囲を狭めてる
    # （n=6のときM56を1ループ目で計算すると、M5~から計算が必要なものは存在しなくなるので）
    # kは計算パターン、M1~3を計算するときで言えば、M12_3かM1_23のどちらかになる
    # 2ループ目から必要になってくるが、要するにこれはM1~5とか離れれば離れるほど計算回数が増える
    # ただしいずれもそこにたどり着くまでに計算した結果を再利用できるので、それを利用して結果を求める
    # そして計算結果は、それまでに計算して求めた乗算回数を利用しつつ、最小の組み合わせになるように最小値で更新し続けて検証する
    # 最終的にたとえばM1_4までの最小の計算回数が求まり、その次のM1_5のときにはその結果を利用すれば計算回数を最小限に抑えられる
    for l in range(2, n + 1):
        for i in range(1, n - l + 2):
            j = i + l - 1
            m[i][j] = float("inf")
            for k in range(i, j):
                m[i][j] = min(m[i][j], m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j])
    print(m[1][n])


if __name__ == '__main__':
    main()
