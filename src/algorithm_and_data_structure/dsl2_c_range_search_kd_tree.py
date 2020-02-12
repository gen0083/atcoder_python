# kD木
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DSL_2_C&lang=jp
import sys


def main():
    n = int(input())
    x_array = []
    y_array = []
    for i in range(n):
        x, y = map(int, sys.stdin.readline().strip().split(" "))
        x_array.append((x, i))
        y_array.append((y, i))
    q = int(input())
    x_list = IndexedList(x_array)
    y_list = IndexedList(y_array)
    for _ in range(q):
        sx, tx, sy, ty = map(int, sys.stdin.readline().strip().split(" "))
        x_set = x_list.find_ids(sx, tx)
        y_set = y_list.find_ids(sy, ty)
        if len(x_set) > 1 and len(y_set) > 1:
            ids = list(x_set & y_set)
            sorted_ids = sorted(ids)
            for i in sorted_ids:
                print(i)
        print("")


class IndexedList(object):
    def __init__(self, array):
        sorted_array = sorted(array, key=lambda r: r[0])
        self.data = sorted_array
        self.size = len(array)

    def _find_lower(self, s):
        low = 0
        top = self.size
        while low + 1 < top:
            mid = (low + top) // 2
            if self.data[mid][0] >= s:
                top = mid
            else:
                low = mid
        return top

    def _find_greater(self, t):
        low = 0
        top = self.size
        while low < top:
            mid = (low + top) // 2
            if self.data[mid][0] > t:
                top = mid
            else:
                low = mid
        return low

    def _find_lower_linear(self, s):
        # これだとそもそも値が範囲外の場合に対応できない（sで与えられた要素に含まれるものが存在しないケースが考慮されてない）
        for i, v in enumerate(self.data):
            if v[0] >= s:
                return i
        return self.size - 1

    def _find_greater_linear(self, t):
        p = 0
        for i, v in enumerate(self.data):
            if v[0] > t:
                return p
            else:
                p = i
        return p

    def find_ids(self, s, t):
        si = self._find_lower_linear(s)
        ti = self._find_greater_linear(t)
        if si == ti:
            # これだと1つだけマッチしてるのかそれともマッチしない結果一致してるのかが判別できない
            return {}
        return {d[1] for d in self.data[si:ti + 1]}


if __name__ == '__main__':
    main()
