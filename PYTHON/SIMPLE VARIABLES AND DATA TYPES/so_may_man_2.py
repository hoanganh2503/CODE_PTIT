t = int(input())

def check(s):
    for x  in s:
        if(x != '4' and x != '7'): return False
    return True

while t > 0:
    t-=1
    s = input()
    if(check(s)): print("YES")
    else: print("NO")