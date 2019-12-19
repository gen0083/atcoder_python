# 連結リスト P95
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_3_C&lang=jp


class LinkedList:
    def __init__(self):
        self.__end = LinkedElement()
        self.__end.next = self.__end
        self.__end.prev = self.__end
        self.__current = self.__end.next

    def insert(self, key):
        new = LinkedElement(key)
        old_first = self.__end.next
        old_first.prev = new
        new.next = old_first
        new.prev = self.__end
        self.__end.next = new

    def delete(self, key):
        for e in self:
            if e.value == key:
                e.prev.next = e.next
                e.next.prev = e.prev
                return

    def delete_first(self):
        old_first = self.__end.next
        new_first = old_first.next
        new_first.prev = self.__end
        self.__end.next = new_first

    def delete_last(self):
        old_last = self.__end.prev
        new_last = old_last.prev
        new_last.next = self.__end
        self.__end.prev = new_last

    def __iter__(self):
        self.__current = self.__end.next
        return self

    def __next__(self):
        if self.__current == self.__end:
            raise StopIteration
        cur = self.__current
        self.__current = self.__current.next
        return cur

    def dump(self):
        return " ".join([str(e.value) for e in self])

    def __str__(self):
        return "LinkedList<[%s]>(end:%s)" % (self.dump(), self.__end)


class LinkedElement:
    def __init__(self, value=-1, prev=None, next=None):
        self.value = value
        self.prev = prev
        self.next = next

    def __str__(self):
        return "LinkedElement<%s← %d →%s>" % (self.prev, self.value, self.next)


def do_code():
    list = LinkedList()
    num = int(input())
    for _ in range(num):
        command = input().split()
        if command[0] == "insert":
            list.insert(int(command[1]))
        elif command[0] == "delete":
            list.delete(int(command[1]))
        elif command[0] == "deleteFirst":
            list.delete_first()
        else:
            list.delete_last()
    print(list.dump())


if __name__ == '__main__':
    do_code()
