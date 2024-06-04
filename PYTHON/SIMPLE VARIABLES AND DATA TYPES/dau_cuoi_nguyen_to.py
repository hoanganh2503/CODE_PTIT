import math
t = int(input())

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

while t > 0:
    t -= 1
    s = input()
    if isPrime(int(s[len(s)-3:])) and isPrime(int(s[:3])): print("YES")
    else: print("NO")
