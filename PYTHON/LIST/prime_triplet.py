import math
def isPrime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n%i == 0: return False
    return n >= 2
for i in range(int(input())):
    n = int(input())
    cnt = 0
    for j in range(5, n-5, 2):
        if(isPrime(j) and isPrime(j+6) and (isPrime(j+4) or isPrime(j+2))): cnt += 1
    print(cnt)
