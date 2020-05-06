# https://atcoder.jp/contests/abc155/tasks/abc155_a


def main():
    a, b, c = input().split(" ")
    dic = dict({a: 0, b: 0, c: 0})
    dic[a] += 1
    dic[b] += 1
    dic[c] += 1
    if dic[a] == 2 or dic[b] == 2 or dic[c] == 2:
        print("Yes")
    else:
        print("No")


if __name__ == '__main__':
    main()
