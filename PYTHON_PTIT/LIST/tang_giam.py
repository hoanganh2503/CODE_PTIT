for _ in range(int(input())):
    a, b = [], [] 
    n = int(input())
    for i in range(n):
        x, y = [float(x) for x in input().split()]
        a.append(x)
        b.append(y)
    dp = [1] * (n)
    for i in range(n):
        for j in range(i):
            if a[i] > a[j] and b[i] < b[j]:
                dp[i] = max(dp[i], dp[j] + 1)
    print(max(dp))