def main():
    a, b = map(int, input().split(" "))
    smaller = min(a, b)
    bigger = max(a, b)
    print(str(smaller) * bigger)


if __name__ == '__main__':
    main()
