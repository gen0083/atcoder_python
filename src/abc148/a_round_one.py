# https://atcoder.jp/contests/abc148/tasks/abc148_a


def main():
    ans = [1,2,3]
    a = int(input())
    b = int(input())
    ans.remove(a)
    ans.remove(b)
    print(ans[0])


if __name__ == '__main__':
    main()
