def do_code():
    five_hundred = int(input())
    hundred = int(input())
    fifty = int(input())
    target = int(input())
    pattern = 0
    for a in range(five_hundred, -1, -1):
        if a * 500 > target:
            continue
        for b in range(hundred, -1, -1):
            if a * 500 + b * 100 > target:
                continue
            for c in range(fifty, -1, -1):
                if a * 500 + b * 100 + c * 50 == target:
                    pattern += 1
    print(pattern)


if __name__ == '__main__':
    do_code()
