# クイックソート
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_6_C&lang=jp
import sys


class Card(object):
    def __init__(self, suit, num):
        self.suit = suit
        self.num = num

    def __str__(self):
        return "%s %d" % (self.suit, self.num)


def check_stabled(origin, after):
    num = 0
    queue = []
    for i in after:
        if num != i.num:
            num = i.num
            index = -1
            for q in queue:
                position = origin.index(q)
                if index > position:
                    return "Not stable"
                else:
                    index = position
            queue = [i]
        else:
            queue.append(i)
    return "Stable"


def partition(a, p, r):
    x = a[r]
    i = p - 1
    for j in range(p, r):
        if a[j].num <= x.num:
            i += 1
            tmp = a[i]
            a[i] = a[j]
            a[j] = tmp
    tmp = a[i + 1]
    a[i + 1] = x
    a[r] = tmp
    return i + 1


def quick_sort(a, p, r):
    if p < r:
        q = partition(a, p, r)
        quick_sort(a, p, q - 1)
        quick_sort(a, q + 1, r)


def main():
    num = int(input())
    array = []
    for _ in range(num):
        l = sys.stdin.readline().split(" ")
        array.append(Card(l[0], int(l[1])))
    origin = array.copy()
    quick_sort(array, 0, num - 1)
    print(check_stabled(origin, array))
    for c in array:
        print(c)


if __name__ == '__main__':
    main()
