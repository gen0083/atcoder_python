def main():
    n = int(input())
    primes = dict()
    t = n
    i = 2
    while i * i <= n and i <= t:
        if t % i == 0:
            count = 0
            while t % i == 0:
                t //= i
                count += 1
            primes[i] = count
        i += 1
    if t != 1:
        primes[t] = 1
    ans = f"{n}:"
    for k in primes.keys():
        count = primes[k]
        ans += f" {k}" * count
    print(ans)


if __name__ == '__main__':
    main()
