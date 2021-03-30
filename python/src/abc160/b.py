#


def main():
    t = int(input())
    gohyaku = t // 500
    remain = t - gohyaku * 500
    goen = 0
    if remain > 0:
        goen = remain // 5
    print(gohyaku * 1000 + goen * 5)


if __name__ == '__main__':
    main()
