# https://atcoder.jp/contests/abc148/tasks/abc148_d


def main():
    num = int(input())
    origin = [int(i) for i in input().split(" ")]
    break_count = 0
    want = 1
    satisfy = False
    for b in origin:
        if b == want:
            want += 1
            satisfy = True
            continue
        else:
            break_count += 1
    print("-1" if not satisfy else break_count)


if __name__ == '__main__':
    main()
