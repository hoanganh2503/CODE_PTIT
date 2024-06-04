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
    nt = knt = 0
    for x in s:
        if x == '2' or x == '5' or x == '7' or x == '3': nt+=1
        else: knt+=1
    return nt > knt

while t > 0:
    t -= 1
    if check(input()): print("YES")
    else: print("NO")
