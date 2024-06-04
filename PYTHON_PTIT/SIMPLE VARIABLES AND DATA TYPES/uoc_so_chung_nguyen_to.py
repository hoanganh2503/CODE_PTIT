import math
t = int(input())

def isPrime(k):
    n = 0
    for i in str(k):
        n += int(i)
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

while t > 0:
    t -= 1
    s = input()
    list = s.split()
    n = math.gcd(int(list[0]), int(list[1]))
    if isPrime(n): print("YES")
    else: print("NO")
