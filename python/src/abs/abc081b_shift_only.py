import numpy as np


def do_code():
    num = input()
    array = np.array([int(i) for i in input().split(" ")])
    count = 0
    while len(array[array % 2 == 1]) == 0:
        count += 1
        array = array / 2
    print(count)


if __name__ == '__main__':
    do_code()
