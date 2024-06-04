import math
t = int(input())

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def check(s):
    ans = 0
    for x in s:
        ans += int(x)
    return isPrime(ans)

while t > 0:
    t -= 1
    if check(input()): print("YES")
    else: print("NO")
