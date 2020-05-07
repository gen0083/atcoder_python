def main():
    n = int(input())
    exist = set(range(1, n + 1))
    count = set()
    t = -1
    for _ in range(n):
        i = int(input())
        if i in count:
            t = i
        else:
            exist.remove(i)
        count.add(i)
    if t == -1:
        print("Correct")
    else:

        print("%d %d" % (t, exist.pop()))


if __name__ == '__main__':
    main()
