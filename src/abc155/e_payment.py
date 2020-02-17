# https://atcoder.jp/contests/abc155/tasks/abc155_e


def main():
    n = input()
    array = [int(s) for s in n]
    count = 0
    use_oturi = False
    for i in range(len(array) - 1, -1, -1):
        v = array[i]
        if v == 10:
            if i != 0:
                v = 0
                array[i - 1] += 1
            else:
                v = 0
                count += 1
        if use_oturi:
            target = 6
        else:
            target = 5
        if v > target:
            count += 10 - v
            use_oturi = True
            if i != 0:
                array[i - 1] += 1
            else:
                count += 1
        else:
            if use_oturi and (v == 3 or v == 2):
                if v == 2:
                    count += 1
                else:
                    count += 2
                if i != 0:
                    array[i - 1] += 1
                else:
                    count += 2
            else:
                use_oturi = False
                count += v
    print(count)


if __name__ == '__main__':
    main()
