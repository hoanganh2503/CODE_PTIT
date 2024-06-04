import math
t = int(input())

list = ['2', '3', '5', '7']

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def check(s):
    for i in range(len(s)):
        if isPrime(i) and s[i] not in list: return "NO"
        if isPrime(i) == False and s[i] in list: return "NO"
    return "YES"

while t > 0:
    t -= 1
    print(check(input()))
