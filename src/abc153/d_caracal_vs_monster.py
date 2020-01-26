from collections import deque


def main():
    h = int(input())
    count = 0
    # queue = deque([h])
    # while len(queue) > 0:
    #     mon = queue.popleft()
    #     count += 1
    #     if mon == 1:
    #         continue
    #     else:
    #         new_hp = mon // 2
    #         queue.append(new_hp)
    #         queue.append(new_hp)
    factor = 1
    while h > 1:
        h //= 2
        count += factor
        factor *= 2
    count += factor
    print(count)


if __name__ == '__main__':
    main()
