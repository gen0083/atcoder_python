# https://atcoder.jp/contests/abc164/tasks/abc164_d


def main():
    s = input()
    length = len(s)
    count = 0
    # 愚直な方法ではTLE
    # for i in range(length - 3):
    #     for j in range(i + 4, length + 1):
    #         n = int(s[i:j])
    #         if n % 2019 == 0:
    #             count += 1
    # これは駄目なパターンだし、結局TLEだし
    for j in range(length, 4, -1):
        i = j - 4
        t = 3
        while i >= 0:
            n = int(s[i:j])
            if n % 2019 == 0:
                for k in range(i, -1, -4):
                    n = int(s[k:j])
                    if n % 2019 == 0:
                        count += 1
                break
            else:
                # ここ3回探索したら十分じゃね？
                i -= 1
                t -= 1
                if t < 0:
                    break
    print(count)


if __name__ == '__main__':
    main()
