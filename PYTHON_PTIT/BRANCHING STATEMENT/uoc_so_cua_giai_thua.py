from math import sqrt
for _ in range(int(input())):
    n, m = [int(x) for x in input().split()]
    ans = 0
    for i in range(1, n+1):
        while i % m == 0:
            ans+=1
            i /= m
    print(ans)
