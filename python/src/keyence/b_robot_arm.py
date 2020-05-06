# https://atcoder.jp/contests/keyence2020/tasks/keyence2020_b


class Robot(object):
    def __init__(self, data):
        self.x = int(data[0])
        self.l = int(data[1])
        self.low = self.x - self.l
        self.high = self.x + self.l

    def contain(self, other):
        return self.low < other.low < self.high or self.low < other.high < self.high or self.low < other.x < self.high

    def __str__(self):
        return "(x=%d, l=%d)" % (self.x, self.l)


def main():
    n = int(input())
    robots = [Robot(input().split(" ")) for _ in range(n)]
    robots.sort(key=lambda robo: robo.low, reverse=True)
    available = []
    for robo in robots:
        ok = True
        for r in available:
            if r.contain(robo):
                ok = False
                break
        if ok:
            available.append(robo)
    print(len(available))


if __name__ == '__main__':
    main()
