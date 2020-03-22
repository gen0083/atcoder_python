# https://atcoder.jp/contests/abc159/tasks/abc159_b


def main():
    s = input()
    n = len(s)
    i = 0
    j = n - 1
    while i < j:
        if s[i] != s[j]:
            print("No")
            return
        i += 1
        j -= 1
    i = 0
    mae_last = (n - 1) // 2 - 1
    usiro_first = (n + 3) // 2 - 1
    while i < mae_last:
        if s[i] != s[mae_last]:
            print("No")
            return
        i += 1
        mae_last -= 1
    i = n - 1
    while i > usiro_first:
        if s[usiro_first] != s[i]:
            print("No")
            return
        i -= 1
        usiro_first += 1
    print("Yes")


if __name__ == '__main__':
    main()
