def main():
    a = [int(s) for s in input().split(" ")]
    a.sort(reverse=True)
    print(a[2])


if __name__ == '__main__':
    main()
