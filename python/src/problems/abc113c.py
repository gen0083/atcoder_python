def main():
    n, m = map(int, input().split(" "))
    p = []
    ids = [0 for _ in range(m)]
    y = []
    rev_y = dict()
    p_order = [1 for _ in range(n + 1)]
    for i in range(m):
        pi, yi = map(int, input().split(" "))
        p.append(pi)
        y.append(yi)
        rev_y[yi] = i
    y.sort()
    for year in y:
        city_index = rev_y[year]
        prefecture_id = p[city_index]
        born_time = p_order[prefecture_id]
        ids[city_index] = born_time
        p_order[prefecture_id] += 1
    for i in range(m):
        print("%s%s" % (padding_str(p[i]), padding_str(ids[i])))


def padding_str(n):
    return str(n).zfill(6)


if __name__ == '__main__':
    main()
