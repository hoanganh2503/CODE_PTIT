def dem(n, d):
    p = 1
    ans = 0
    l = n
    r = 0
    while l > 0:
        x = l % 10
        l //= 10
        ans += l * p
        if x == d:
            ans += r + 1
        elif x > d:
            ans += p
        p *= 10
        r = n % p
    if d == 0:
        ans -= (p - 1) // 9
    return ans

t = int(input())
for _ in range(t):
    a, b = map(int, input().split())
    if a > b:
        a, b = b, a
    cnt = [dem(b, i) for i in range(10)]
    if a - 1 > 0:
        cnt = [cnt[i] - dem(a - 1, i) for i in range(10)]
    print(*cnt)