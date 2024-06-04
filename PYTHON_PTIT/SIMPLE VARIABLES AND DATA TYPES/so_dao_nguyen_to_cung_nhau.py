import math
t = int(input())
while t > 0:
    t-=1   
    s = input()
    if math.gcd(int(s), int(s[::-1])) == 1: print("YES")
    else: print("NO")