import math
t = int(input())

while t > 0:
    t -= 1
    if int(input()) % 3 == 0: print("YES")
    else: print("NO")