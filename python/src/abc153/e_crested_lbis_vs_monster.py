# https://atcoder.jp/contests/abc153/tasks/abc153_e


def main():
    h, n = map(int, input().split(" "))
    dp = [float("inf")] * (h + 1)
    dp[0] = 0
    for i in range(n):
        damage, cost = map(int, input().split(" "))
        for total in range(h + 1):
            # 現在の蓄積ダメージから、魔法iを使った場合に与えるダメージ
            next_damage = min(total + damage, h)
            dp[next_damage] = min(dp[next_damage], dp[total] + cost)
    print(dp[-1])


if __name__ == '__main__':
    main()
