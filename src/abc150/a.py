#


def main():
    coins, test = map(int, input().split(" "))
    if 500 * coins >= test:
        print("Yes")
    else:
        print("No")


if __name__ == '__main__':
    main()
