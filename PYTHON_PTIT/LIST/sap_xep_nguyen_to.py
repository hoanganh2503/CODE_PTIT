from math import sqrt
def isPrime(n):
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False
    return n >= 2

n = int(input())
arr = [int(i) for i in input().split()]
prime = []
for i in arr:
    if isPrime(i): prime.append(i)
prime.sort()
k = 0
for i in arr:
    if isPrime(i):
        print(prime[k], end=' ')
        k+=1
    else: print(i, end=' ')
