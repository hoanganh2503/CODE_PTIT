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
    if isPrime(len(s)) == False: return False
    snt = s.count('2') + s.count('3') + s.count('7') + s.count('5')
    return snt > len(s) - snt

while t > 0:
    t -= 1
    if check(input()): print("YES")
    else: print("NO")
