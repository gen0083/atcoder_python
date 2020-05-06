def do_code():
    a, b = map(lambda i: int(i) % 2, input().split(" "))
    if a + b == 2:
        print("Odd")
    else:
        print("Even")


if __name__ == '__main__':
    do_code()
