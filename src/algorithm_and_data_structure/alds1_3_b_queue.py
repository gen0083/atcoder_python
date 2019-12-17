# キュー P89
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_3_B&lang=jp
from collections import deque


class Process:
    def __init__(self, array):
        self.__name = array[0]
        self.__time = int(array[1])
        self.__end = False

    def is_end(self):
        return self.__end

    def lap(self, quantum):
        if self.__time > quantum:
            self.__time -= quantum
            return quantum
        else:
            self.__end = True
            return self.__time

    def record(self, end):
        self.__time = end

    def dump(self):
        return "%s %d" % (self.__name, self.__time)

    def __str__(self):
        return "Process<%s>" % self.dump()


def do_code():
    num, quantum = map(int, input().split(" "))
    queue = deque([Process(input().split(" ")) for _ in range(num)])
    time = 0
    finished = []
    while len(queue) > 0:
        p = queue.popleft()
        lap = p.lap(quantum)
        time += lap
        if p.is_end():
            p.record(time)
            finished.append(p)
        else:
            queue.append(p)
    for p in finished:
        print(p.dump())


if __name__ == '__main__':
    do_code()
