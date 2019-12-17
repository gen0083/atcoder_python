# 安定なソート P70
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_2_C&lang=jp


class Card:
    def __init__(self, data):
        self.__suit = data[0]
        self.__value = int(data[1])

    @property
    def value(self):
        return self.__value

    def print(self):
        return "%s%d" % (self.__suit, self.__value)


def do_code():
    num = int(input())
    origin = [Card(s) for s in input().split(" ")]
    bubble = bubble_sort(origin, num)
    selection = selection_sort(origin, num)
    print(print_array(bubble))
    print(check_stable(origin, bubble))
    print(print_array(selection))
    print(check_stable(origin, selection))


def bubble_sort(origin, num):
    array = origin.copy()
    for i in range(num):
        for j in range(num - 1, i, -1):
            if array[j].value < array[j - 1].value:
                tmp = array[j]
                array[j] = array[j - 1]
                array[j - 1] = tmp
    return array


def selection_sort(origin, num):
    array = origin.copy()
    for i in range(num):
        minj = i
        for j in range(i, num):
            if array[j].value < array[minj].value:
                minj = j
        tmp = array[i]
        array[i] = array[minj]
        array[minj] = tmp
    return array


def check_stable(origin, sorted):
    stack = []
    for t in sorted:
        if len(stack) == 0:
            stack.append(t)
        else:
            if stack[-1].value == t.value:
                stack.append(t)
            else:
                i = origin.index(stack.pop(0))
                for c in stack:
                    ii = origin.index(c)
                    if ii < i:
                        return "Not stable"
                    else:
                        i = ii
                stack = []
    return "Stable"


def print_array(array):
    return " ".join(map(lambda x: x.print(), array))


if __name__ == '__main__':
    do_code()
