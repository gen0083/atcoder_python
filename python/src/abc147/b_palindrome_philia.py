def do_code():
    s = input()
    lim = int(len(s) / 2)
    count = 0
    for i in range(lim):
        if s[i] != s[-(i + 1)]:
            count += 1
    print(count)


if __name__ == '__main__':
    do_code()
