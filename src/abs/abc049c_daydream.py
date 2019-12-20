# https://atcoder.jp/contests/abs/tasks/arc065_a


def main():
    s = input()
    t = s[:]
    no = False
    while len(t) > 0:
        if t[-1] == "m" and t[-5:] == "dream":
            t = t[:-5]
        elif t[-1] == "e" and t[-5:] == "erase":
            t = t[:-5]
        elif t[-1] == "r":
            if t[-6:] == "eraser":
                t = t[:-6]
            elif t[-7:] == "dreamer":
                t = t[:-7]
            else:
                no = True
                break
        else:
            no = True
            break
    if no:
        print("NO")
    else:
        print("YES")


if __name__ == '__main__':
    main()
