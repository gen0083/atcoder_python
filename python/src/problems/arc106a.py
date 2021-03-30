def main():
    n = int(input())
    for i in range(1, 40):
        for j in range(1, 30):
            t = 3 ** i + 5 ** j
            if t == n:
                print(f"%d %d" % (i, j))
                return
    print(-1)


if __name__ == '__main__':
    main()
