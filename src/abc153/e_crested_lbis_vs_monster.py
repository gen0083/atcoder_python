class Magic(object):
    def __init__(self, damage, cost):
        self.damage = damage
        self.cost = cost
        self.efficiency = damage / cost

    def __str__(self):
        return "Magic(d=%d, c=%d, e=%f)" % (self.damage, self.cost, self.efficiency)


def main():
    h, n = map(int, input().split(" "))
    magic = []
    for _ in range(n):
        d, c = map(int, input().split(" "))
        magic.append(Magic(d, c))
    # これだとsample3に対応できない
    magic.sort(key=lambda t: t.efficiency, reverse=True)
    base = h // magic[0].damage
    if base * magic[0].damage == h:
        print(base * magic[0].cost)
        return
    remain = h - base * magic[0].damage
    minimum = magic[0].cost
    for i in range(n):
        if magic[i].damage > remain:
            if minimum > magic[i].cost:
                minimum = magic[i].cost
    print(magic[0].cost * base + minimum)



if __name__ == '__main__':
    main()
