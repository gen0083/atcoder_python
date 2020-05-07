def main():
    n, q = map(int, input().split(" "))
    # 1indexにする、ユーザ番号1とかで入ってくるので：よって0使わない
    user = [set() for _ in range(n + 1)]
    follower = [set() for _ in range(n + 1)]
    for _ in range(q):
        command = list(map(int, input().split(" ")))
        if command[0] == 1:
            a = command[1]
            b = command[2]
            user[a].add(b)
            follower[b].add(a)
        elif command[0] == 2:
            a = command[1]
            user[a] = user[a] | follower[a]
            for e in user[a]:
                follower[e].add(a)
        else:
            a = command[1]
            for x in user[a]:
                user[a] = user[a] | user[x]
            for x in user[a]:
                follower[x].add(a)
    for i in range(1, n + 1):
        o = ["N" for _ in range(n)]
        for e in user[i]:
            if e == i:
                continue
            o[e - 1] = "Y"
        print("".join(o))


if __name__ == '__main__':
    main()
