def main():
    n = int(input())
    data = [int(s) for s in input().split(" ")]
    low = data[0]
    count = 0
    for i in data:
        if low >= i:
            count += 1
            low = i
    print(count)


if __name__ == '__main__':
    main()
