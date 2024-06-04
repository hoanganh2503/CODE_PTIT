import math

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

t = int(input())

while t > 0:
    t-=1
    s = int(input())
    k = 0
    for i in range(1, s):
        if math.gcd(i, s): k+=1
    if isPrime(k): print("YES")
    else: print("NO")