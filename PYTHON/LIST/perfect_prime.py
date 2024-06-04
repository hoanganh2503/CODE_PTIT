from math import sqrt
lt = ['2', '3', '7', '5']

def isPrime(n):
    for i in range(2, int(sqrt(n)+1)):
        if n % i == 0: return False
    return n >= 2

def check(s):
    sum = 0
    for x in s:
        if x not in lt: return False
        sum += int(x)
    return isPrime(sum) and isPrime(int(s)) and isPrime(int(s[::-1]))

for _ in range(int(input())):
    if check(input()): print('Yes')
    else: print('No')