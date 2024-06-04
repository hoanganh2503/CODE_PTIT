from math import sqrt
def isPrime(n):
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False
    return n >= 2

n, m = [int(x) for x in input().split()]
arr = []
max = -1
for i in range(n):
    a = [int(x) for x in input().split()]
    for x in a:
        if isPrime(x) and x > max: max = x
    arr.append(a)
if max == -1: print("NOT FOUND")
else:
    print(max)
    for i in range(n):  
        for j in range(m):
            if arr[i][j] == max: print(f"Vi tri [{i}][{j}]")