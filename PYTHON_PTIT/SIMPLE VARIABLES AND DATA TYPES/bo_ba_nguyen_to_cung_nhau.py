import math
k, n = input().split()
k = int(k)
n = int(n)
for i in range(k, n-1):
    for j in range(i+1, n):
        for k in range(j+1, n+1):
            if math.gcd(i, j) == math.gcd(i, k) == math.gcd(k, j) == 1:
                print(f'({i}, {j}, {k})')