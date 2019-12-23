# https://atcoder.jp/contests/abc148/tasks/abc148_e
# TODO: timeoutを乗り越えろ
# 二重階乗になるわけで、sympy.factorial2(n)使うといけるっぽい
# そもそも10で何回割れるかという話なので、二重階乗の値を求めなくとも答えを導き出せる
# が式の変形を解説されてもさっぱりわからん
# https://www.youtube.com/watch?v=F2p_e6iKxnk&feature=youtu.be
# 自力で10で割れる数を数えたらいいんじゃないかというひらめきをえることはできたんだが、
# 単純に10で割れる数をカウントアップしても回答にはならない
# 理由は単純で、10だと1つ0がつくけど、100だと2個つくから
# そして110は1つ増えるので、単純に10で割ればいいわけではない


def main():
    num = int(input())
    # 奇数の場合は末尾に0が出てこないので0になる
    if num % 2 == 1:
        print(0)
        return
    count = 0
    step = 1
    p = num
    while p > 0:
        count += p // 10 * step
        p //= 10
        step += 1
    print(count)


if __name__ == '__main__':
    main()
