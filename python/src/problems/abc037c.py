from collections import deque


def main():
    n, k = map(int, input().split(" "))
    a = [int(s) for s in input().split(" ")]
    q = deque()
    total = 0
    t = 0
    for i in a:
        t += i
        q.append(i)
        num = len(q)
        if num < k:
            continue
        if num > k:
            t -= q.popleft()
        total += t
    print(total)


if __name__ == '__main__':
    main()
