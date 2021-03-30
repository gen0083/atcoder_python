import sys


def main():
    n = int(sys.stdin.readline().rstrip())
    c = [0]
    sell_c = [0 for _ in range(n + 1)]
    odd_min_c = 1000000000
    odd_count = 0
    min_c = 1000000000
    i = 1
    for s in sys.stdin.readline().rstrip().split(" "):
        v = int(s)
        c.append(v)
        if i % 2 == 1:
            odd_count += 1
            if odd_min_c > v:
                odd_min_c = v
        if min_c > v:
            min_c = v
        i += 1
    q = int(sys.stdin.readline())
    sell = 0
    all_query = 0
    odd_query = 0
    for _ in range(q):
        command = list(map(int, sys.stdin.readline().rstrip().split(" ")))
        if command[0] == 1:
            x = command[1]
            a = command[2]
            sell_count = sell_c[x] + a + all_query
            is_odd = x % 2 == 1
            if is_odd:
                sell_count += odd_query
            if c[x] >= sell_count:
                sell += a
                sell_c[x] += a
                remain = c[x] - sell_count
                if is_odd:
                    if odd_min_c > remain:
                        odd_min_c = remain
                if min_c > remain:
                    min_c = remain
        elif command[0] == 2:
            a = command[1]
            if odd_min_c >= a:
                sell += a * odd_count
                odd_min_c -= a
                odd_query += a
                if min_c > odd_min_c:
                    min_c = odd_min_c
        else:
            a = command[1]
            if min_c >= a:
                sell += a * n
                min_c -= a
                odd_min_c -= a
                all_query += a
    print(sell)


if __name__ == '__main__':
    main()
