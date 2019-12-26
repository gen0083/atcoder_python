# コッホ曲線
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_C&lang=jp
import math


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
        return "Point[%f,%f]" % (self.x, self.y)


def make_koch(start, end, n):
    if n == 0:
        return [start, end]
    divided = start.divide(end)
    tri = make_triangle(divided[1], divided[2])
    points = [divided[0], *tri, divided[3]]
    ret = [*(make_koch(points[i], points[i + 1], n - 1) for i in range(len(points) - 1))]
    return ret


def make_triangle(start, end):
    length = start.subtract(end)
    angle = math.radians(60)
    if start.x < end.x and start.y == end.y:
        angle = math.radians(60)
    elif start.x > end.x and start.y > end.y:
        angle = math.radians(120)
    elif start.x < end.x and start.y > end.y:
        angle = math.radians(180)
    elif start.x < end.x and start.y == end.y:
        angle = math.radians(240)
    elif start.x < end.x and start.y < end.y:
        angle = math.radians(300)
    else:
        angle = math.radians(360)
    new_point_x = length.x * math.cos(angle) + start.x
    new_point_y = length.x + math.tan(angle) + start.y
    return [start, Point(new_point_x, new_point_y), end]


def main():
    n = int(input())
    points = make_koch(Point(0, 0), Point(1000, 0), n)
    for p in points:
        print("%d %d" % (p.x, p.y))


if __name__ == '__main__':
    # main()
    print(* make_triangle(Point(0,0), Point(100,0)))