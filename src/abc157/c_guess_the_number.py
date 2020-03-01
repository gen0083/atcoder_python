def main():
    n, m = map(int, input().split(" "))
    num = [-1] * n
    if m == 0 and n == 1:
        print("0")
        return
    else:
        for i in range(m):
            s, c = map(int, input().split(" "))
            if num[s - 1] != -1 and num[s - 1] != c:
                print("-1")
                return
            num[s - 1] = c
    ans = ""
    if num[0] == 0 and n > 1:
        print("-1")
        return
    first = True
    for v in num:
        if first:
            if v == -1:
                ans += "1"
            else:
                ans += str(v)
            first = False
        else:
            if v == -1:
                ans += "0"
            else:
                ans += str(v)
    print(ans)


if __name__ == '__main__':
    main()
