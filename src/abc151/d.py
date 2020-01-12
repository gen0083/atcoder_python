import sys


def update_cost(area, possible, i, j, cost):
    if area[i][j] == "#":
        return False
    if possible[i][j] < cost:
        possible[i][j] = cost
        return True


def move_cost(area, possible, cost, i, j, h, w):
    move_candidate = area[:]
    move_candidate[i][j] = "#"
    cost += 1
    if i < h - 2:
        if update_cost(area, possible, i + 1, j, cost):
            move_cost(move_candidate, possible, cost, i + 1, j, h, w)
    if h > i > 1:
        if update_cost(area, possible, i - 1, j, cost):
            move_cost(move_candidate, possible, cost, i - 1, j, h, w)
    if j < w - 2:
        if update_cost(area, possible, i, j + 1, cost):
            move_cost(move_candidate, possible, cost, i, j + 1, h, w)
    if w > j > 1:
        if update_cost(area, possible, i, j - 1, cost):
            move_cost(move_candidate, possible, cost, i, j - 1, h, w)


def main():
    h, w = map(int, sys.stdin.readline().split())
    area = [[s for s in sys.stdin.readline().strip()] for _ in range(h)]
    possible = [[0] * w] * h
    for i in range(h):
        for j in range(w):
            move_cost(area, possible, 1, i, j, h, w)
    print(area)
    print(possible)


if __name__ == '__main__':
    main()
