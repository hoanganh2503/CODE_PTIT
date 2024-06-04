from decimal import Decimal   
t = int(input())
while t > 0:
    t-=1
    s = input()
    temp = s.split()
    a = Decimal(temp[0])
    b = Decimal(temp[1])
    c = Decimal(temp[2])
    cnt = 0
    while a < c:
        cnt+=1
        a = a * (1 + Decimal(b) / Decimal(100.0))
    print(cnt)