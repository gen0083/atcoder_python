def do_code():
    s = input().strip()
    count = 0
    for c in s:
        if c == '1':
            count += 1
    print(count)


if __name__ == '__main__':
    do_code()
