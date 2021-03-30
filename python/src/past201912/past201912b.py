def main():
    n = int(input())
    p = int(input())
    for _ in range(n - 1):
        i = int(input())
        if i == p:
            print("stay")
        elif i > p:
            print("up %d" % (i - p))
        else:
            print("down %d" % (p - i))
        p = i


if __name__ == '__main__':
    main()
