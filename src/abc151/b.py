def main():
    n, k, m = map(int, input().split(" "))
    total = 0
    for i in input().split(" "):
        point = int(i)
        total += point
    target = m * n
    remain = target - total
    if remain <= 0:
        print("0")
    elif remain <= k:
        print(remain)
    else:
        print("-1")


if __name__ == '__main__':
    main()
