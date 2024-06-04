import math
t = int(input())

def handle(s):
    tong = 0
    tich = 1
    tmp = 1
    for i in range(len(s)):
        if i % 2 == 1: tong += int(s[i])
        else:
            if s[i] == '0': continue
            else:
                tich*= int(s[i])
                tmp = 0
    print(f'{abs(tich-tmp)} {tong}')

while t > 0:
    t -= 1
    handle(input())
