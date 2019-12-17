# スタック P82
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_3_A&lang=jp


def do_code():
    stack = []
    operator = ["+", "-", "*"]
    for s in input().split(" "):
        if s in operator:
            b = stack.pop()
            a = stack.pop()
            if s == "+":
                stack.append(a + b)
            elif s == "-":
                stack.append(a - b)
            else:
                stack.append(a * b)
        else:
            stack.append(int(s))
    print(str(stack.pop()))


if __name__ == '__main__':
    do_code()
