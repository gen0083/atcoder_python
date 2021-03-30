class Card(object):
    def __init__(self, red, blue):
        self.red = red
        self.blue = blue
        self.surface = red
        self.isRed = True

    def flip(self):
        if self.isRed:
            self.surface = self.blue
            self.isRed = False
        else:
            self.surface = self.red
            self.isRed = True


def main():
    n = int(input())
    a = [int(s) for s in input().split(" ")]
    b = [int(s) for s in input().split(" ")]
    if a == sorted(a[:]):
        print("0")
        return

    print()


if __name__ == '__main__':
    main()
