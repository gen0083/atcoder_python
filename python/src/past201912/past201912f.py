import re
import sys


def main():
    s = input()
    p = re.compile(r'([A-Z][a-z]*[A-Z])+?')
    words = p.findall(s)
    words = list(map(lambda x: x.lower(), words))
    words.sort()
    out = sys.stdout
    for w in words:
        out.write("%s%s%s" % (w[0].upper(), w[1:-1], w[-1].upper()))
    out.flush()


if __name__ == '__main__':
    main()
