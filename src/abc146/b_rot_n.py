from functools import reduce


def do_code():
    rot = int(input())
    str = input()
    table = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    ans = reduce(lambda red, s: red + table[(table.index(s) + rot) % 26], str[:], "")
    print(ans)


if __name__ == '__main__':
    do_code()
