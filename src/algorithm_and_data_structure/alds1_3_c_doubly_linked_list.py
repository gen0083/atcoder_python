# 連結リスト P95
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_3_C&lang=jp


class LinkedList:
    def __init__(self):
        self.__size = 0
        self.__first = None
        self.__current = self.__first
        self.__last = self.__first

    def command(self, command, key=""):
        if command == "insert":
            # do insert
            element = LinkedElement(int(key))
            old_first = self.__first
            element.connect_next(old_first)
            if old_first is not None:
                old_first.connect_prev(element)
            self.__first = element
            if self.__size == 0:
                self.__last = element
            self.__size += 1
        elif command == "delete":
            target = int(key)
            for e in self:
                if e.value == target:
                    prev = e.prev()
                    next = e.next()
                    if prev is not None:
                        prev.connect_next(next)
                    if next is not None:
                        next.connect_prev(prev)
                    if e == self.__last:
                        self.__last = prev
                    if e == self.__first:
                        self.__first = next
                    self.__size -= 1
                    self.__check_empty()
                    return
        elif command == "deleteFirst":
            self.__first = self.__first.next()
            if self.__first is not None:
                self.__first.connect_prev(None)
            self.__size -= 1
            self.__check_empty()
        elif command == "deleteLast":
            self.__last = self.__last.prev()
            if self.__last is not None:
                self.__last.connect_next(None)
            self.__size -= 1
            self.__check_empty()
        else:
            raise NotImplemented

    def __iter__(self):
        self.__current = self.__first
        return self

    def __next__(self):
        if self.__current is None:
            raise StopIteration
        cur = self.__current
        self.__current = self.__current.next()
        return cur

    def dump(self):
        return " ".join(map(lambda e: str(e.value), self))

    def __check_empty(self):
        if self.__size == 0:
            self.__first = None
            self.__last = None


class LinkedElement:
    def __init__(self, value=-1):
        self.__value = value
        self.__prev = None
        self.__next = None

    def has_next(self):
        return self.__next is not None

    def connect_prev(self, element):
        self.__prev = element

    def connect_next(self, element):
        self.__next = element

    @property
    def value(self):
        return self.__value

    def next(self):
        return self.__next

    def prev(self):
        return self.__prev


def do_code():
    list = LinkedList()
    num = int(input())
    for _ in range(num):
        command = input().split()
        if len(command) == 1:
            list.command(command[0])
        else:
            list.command(command[0], command[1])
    print(list.dump())


if __name__ == '__main__':
    do_code()
