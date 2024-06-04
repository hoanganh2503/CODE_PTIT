import math
def isPrime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return n >= 2

n, m = map(int, input().split())
arr = []
for _ in range(n):
    row = [int(x) for x in input().split()]
    arr.append(row)
for i in arr:
    for j in i:
        if isPrime(j): print(1, end = ' ')
        else: print(0, end=' ')
    print()
