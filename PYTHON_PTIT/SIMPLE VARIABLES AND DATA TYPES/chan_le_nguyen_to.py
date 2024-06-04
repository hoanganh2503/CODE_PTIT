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
    sum = 0
    for i in range(len(s)):
        if i%2 == 0 and int(s[i]) % 2 == 1: return "NO"
        if i%2 == 1 and int(s[i]) % 2 == 0: return "NO"
        sum += int(s[i])
    return "YES" if isPrime(sum) else "NO"

while t > 0:
    t -= 1
    print(check(input()))
