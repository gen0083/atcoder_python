# https://atcoder.jp/contests/abc155/tasks/abc155_e
# TODO: DP使ってやるらしいけどいまいちピンとこない　https://www.youtube.com/watch?v=SG60Cp9pSog&feature=youtu.be


def main():
    n = "0" + input()
    array = [int(s) for s in n]
    count = 0
    use_oturi = False
    for i in range(len(array) - 1, -1, -1):
        v = array[i]
        if use_oturi:
            v += 1
        if v == 10:
            continue
        elif v > 5:
            count += 10 - v
            use_oturi = True
        else:
            use_oturi = False
            count += v
    print(count)


if __name__ == '__main__':
    main()
