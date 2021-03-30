from collections import deque


def main():
    v, e = map(int, input().split(" "))
    children = [set() for _ in range(v)]
    parents = [set() for _ in range(v)]
    for _ in range(e):
        s, t = map(int, input().split(" "))
        children[s].add(t)
        parents[t].add(s)
    queue = deque()
    visited = set()
    for i, e in enumerate(parents):
        if len(e) == 0:
            queue.append(i)
    while len(visited) < v:
        times = len(queue)
        for i in range(times):
            e = queue.popleft()
            if e in visited:
                continue
            if len(parents[e] & visited) == len(parents[e]):
                visited.add(e)
                queue.extend(children[e])
                print(e)


if __name__ == '__main__':
    main()
