import sys


def main():
    n, m = map(int, sys.stdin.readline().split(" "))
    mem = dict()
    ac_count = 0
    wrong_count = 0
    for _ in range(m):
        t, result = sys.stdin.readline().strip().split(" ")
        test_no = int(t)
        if test_no > n:
            continue
        if test_no in mem:
            if mem[test_no] > 0:
                if mem[test_no] == -1:
                    continue
                if result == "WA":
                    mem[test_no] += 1
                else:
                    ac_count += 1
                    wrong_count += mem[test_no]
                    mem[test_no] = -1
        else:
            mem[test_no] = result == "AC"
            if result == "WA":
                mem[test_no] = 1
            else:
                ac_count += 1
                mem[test_no] = 0
    print("%d %d" % (ac_count, wrong_count))


if __name__ == '__main__':
    main()
