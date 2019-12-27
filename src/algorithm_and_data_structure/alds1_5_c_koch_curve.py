# コッホ曲線
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_C&lang=jp
import math
import numpy as np


class Point(object):
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def add(self, other):
        return Point(self.x + other.x, self.y + other.y)

    def subtract(self, end):
        return Point(end.x - self.x, end.y - self.y)

    def divide(self, end):
        """
        線分の基点を利用して終点を引数に与えること
        """
        length = self.subtract(end)
        dx = length.x / 3
        dy = length.y / 3
        return [self, Point(self.x + dx, self.y + dy), Point(end.x - dx, end.y - dy), end]

    def __str__(self):
        return "%f %f" % (self.x, self.y)


def make_koch(start, end, n):
    if n == 0:
        return
    divided = start.divide(end)
    make_koch(start, divided[1], n - 1)
    print(divided[1])
    tri = make_triangle(divided[1], divided[2])
    make_koch(divided[1], tri, n - 1)
    print(tri)
    make_koch(tri, divided[2], n - 1)
    print(divided[2])
    make_koch(divided[2], end, n - 1)


def make_triangle(start, end):
    length = start.subtract(end)
    angle = math.radians(60)
    new_point_x = length.x * math.cos(angle) - length.y * math.sin(angle) + start.x
    new_point_y = length.x * math.sin(angle) + length.y * math.cos(angle) + start.y
    return Point(new_point_x, new_point_y)


def main():
    n = int(input())
    start = Point(0, 0)
    end = Point(100, 0)
    print(start)
    make_koch(Point(0, 0), Point(100, 0), n)
    print(end)


if __name__ == '__main__':
    main()
