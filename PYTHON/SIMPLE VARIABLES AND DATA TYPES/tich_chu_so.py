import math
t = int(input())

def handle(s):
    ans = 1
    for x in s:
        if x != '0': ans *= int(x)
    return ans

while t > 0:
    t -= 1
    print(handle(input()))
