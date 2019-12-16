def do_code():
    num = int(input())
    rate = [int(input()) for i in range(num)]
    benefit = rate[-1] - rate[-2]
    max = rate[-1]
    for i in rate[-2::-1]:
        if max - i > benefit:
            benefit = max - i
        if i > max:
            max = i
    print(benefit)


if __name__ == '__main__':
    do_code()
