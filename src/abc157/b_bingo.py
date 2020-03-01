def main():
    bingo = [input().split(" ") for _ in range(3)]
    n = int(input())
    line = [[], [], []]
    v_line = [[], [], []]
    cross1 = []
    cross2 = []
    for _ in range(n):
        num = input()
        found = False
        for i in range(3):
            for j in range(3):
                if bingo[i][j] == num:
                    found = True
                    if i == j:
                        cross1.append((i, j))
                    if i == 0 and j == 2:
                        cross2.append((i, j))
                    if i == 2 and j == 0:
                        cross2.append((i, j))
                    if i == 1 and j == 1:
                        cross2.append((i, j))
                    line[i].append((i, j))
                    v_line[j].append((i, j))
                    continue
            if found:
                continue
    for l in line:
        if len(l) == 3:
            print("Yes")
            return
    for l in v_line:
        if len(l) == 3:
            print("Yes")
            return
    if len(cross1) == 3:
        print("Yes")
    elif len(cross2) == 3:
        print("Yes")
    else:
        print("No")


if __name__ == '__main__':
    main()
