mod = 1000000007
memo = {}

def pow(a, b):
    if b == 0:
        return 1

    if b in memo:
        return memo[b]

    x = pow(a, b // 2)
    x = (x * x) % mod
    if b % 2 == 1:
        x = (x * a) % mod

    memo[b] = x
    return x

def cal(n, k):
    if k <= 1:
        return k

    if k in memo:
        return memo[k]

    result = (pow(n, k - 1) + cal(n, k - 1)) % mod
    memo[k] = result
    return result

t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    print(cal(n, k))