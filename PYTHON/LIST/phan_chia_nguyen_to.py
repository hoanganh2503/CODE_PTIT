from math import sqrt
from collections import OrderedDict
def isPrime(n):
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False
    return n >= 2

n = int(input())
arr = list(OrderedDict.fromkeys(int(x) for x in input().split()))
check = False
for i in range(len(arr)):
    if isPrime(sum(arr[:i+1])) and isPrime(sum(arr[i+1:])):
        print(i)
        check = True
        break
if check==False: print("NOT FOUND")
