# https://atcoder.jp/contests/abs/tasks/arc089_a
import sys


def main():
    num = int(input())
    pt = 0
    px = 0
    py = 0
    impossible = False
    for _ in range(num):
        (t, x, y) = map(int, sys.stdin.readline().split(" "))
        if t < x + y:
            impossible = True
            break
        if t % 2 != (x + y) % 2:
            impossible = True
            break
        deltax = abs(x - px)
        deltay = abs(y - py)
        deltat = t - pt
        if deltat != deltax + deltay:
            remain = abs(deltat - (deltax + deltay))
            if remain % 2 != 0:
                impossible = True
                break
        px = x
        py = y
        pt = t
    print("No" if impossible else "Yes")


if __name__ == '__main__':
    main()
