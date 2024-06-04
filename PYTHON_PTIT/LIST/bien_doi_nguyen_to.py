snt = []
import math
def isPrime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return n >= 2

for i in range(2, 10001):
    if isPrime(i):
        snt.append(i)
n = int(input())
ans = 0
arr = [int(x) for x in input().split()]
for i in arr:
    x = 10**10
    for j in snt:
        x = min(x, abs(j-i))
    ans = max(ans, x)
print(ans)
