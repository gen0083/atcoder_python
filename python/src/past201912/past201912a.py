import re


def main():
    s = input()
    p = re.compile(r'^[0-9]{3}$')
    if p.match(s):
        print(int(s) * 2)
    else:
        print("error")


if __name__ == '__main__':
    main()
