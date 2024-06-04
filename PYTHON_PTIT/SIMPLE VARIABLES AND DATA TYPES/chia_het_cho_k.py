import math
s = input()
list = s.split()
a = int(list[0])
k = int(list[1])
n = int(list[2])
check = True
b = math.ceil(a/k)*k - a
while a + b <= n:
    if b > 0:
        print(b, end=' ')
        check = False
    b+=k
if(check): print(-1)
