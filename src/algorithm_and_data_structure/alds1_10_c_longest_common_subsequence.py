# 最長共通部分列
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_10_C&lang=jp
import sys


def main():
    q = int(sys.stdin.readline().strip())
    for _ in range(q):
        x = sys.stdin.readline().strip()
        y = sys.stdin.readline().strip()
        longer = x
        shorter = y
        if len(y) > len(x):
            longer = y
            shorter = x
        appear = dict()
        # まず各文字の出現位置を集計
        for i in range(len(longer)):
            if longer[i] in appear:
                appear[longer[i]].append(i)
            else:
                appear[longer[i]] = [i]
        # 次に短い方の文字列の組み合わせを生成
        pattern = set()
        generate_str_pattern(pattern, shorter, "", 0)
        # 共通の最長文字列を探す
        max = 0
        last_appear = dict()
        for s in pattern:
            if len(s) <= max:
                continue
            position = -1
            for i in range(len(s)):
                position = find_position_next(appear, s[i], position)
                if position < 0:
                    break
            if position >= 0:
                if len(s) > max:
                    max = len(s)
        print(max)


def find_position_next(apper, char, current_position):
    if char in apper:
        for i in range(len(apper[char])):
            if apper[char][i] > current_position:
                return apper[char][i]
        return -1
    else:
        return -1


def generate_str_pattern(pattern, string, current_string, current_index):
    if current_index >= len(string):
        if len(current_string) == 0:
            return
        pattern.add(current_string)
    else:
        generate_str_pattern(pattern, string, current_string, current_index + 1)
        generate_str_pattern(pattern, string, current_string + string[current_index],
                             current_index + 1)


if __name__ == '__main__':
    main()
