import math
t = int(input())

def check(s):
    s1 = s[::-1]
    for i in range(len(s)-1):
        if(abs(ord(s[i]) - ord(s[i+1])) != abs(ord(s1[i]) - ord(s1[i+1]))): return False
    return True

while t > 0:
    t -= 1
    if check(input()): print("YES")
    else: print("NO")
