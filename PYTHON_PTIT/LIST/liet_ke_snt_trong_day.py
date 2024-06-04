import math
def isPrime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return n >= 2

n = input()
lt = [int(x) for x in input().split()]
st = sorted((set(lt)), key = lt.index)
for i in st:
    if isPrime(i):
        print(f'{i} {lt.count(i)}')