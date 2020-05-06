# https://atcoder.jp/contests/abc153/tasks/abc153_c


def main():
    n, k = map(int, input().split(" "))
    monster = [int(s) for s in input().split(" ")]
    monster.sort(reverse=True)
    attack = 0
    for i in range(k, n):
        attack += monster[i]
    print(attack)


if __name__ == '__main__':
    main()
