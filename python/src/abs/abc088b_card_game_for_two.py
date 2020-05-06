def do_code():
    num = int(input())
    cards = [int(i) for i in input().split(" ")]
    cards.sort(reverse=True)
    alice = 0
    bob = 0
    for i, a in enumerate(cards):
        if i % 2 == 0:
            alice += a
        else:
            bob += a
    print(alice - bob)


if __name__ == '__main__':
    do_code()
