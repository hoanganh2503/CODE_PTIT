from decimal import Decimal
t = int(input())
while t > 0:
    t-=1
    n = int(input())
    sum = 0.0
    for i in range(n%2, n+1, 2):
        if(i == 0): continue
        sum += 1/i
    print("%.6f"%sum)
    