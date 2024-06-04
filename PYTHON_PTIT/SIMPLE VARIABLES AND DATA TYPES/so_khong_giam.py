import math
t = int(input())

def isPrime(s):
    for i in range(len(s) - 1):
        if int(s[i]) > int(s[i+1]):
            return False
    return True

while t > 0:
    t -= 1
    s = input()
    if isPrime(s): print("YES")
    else: print("NO")
