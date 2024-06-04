t = int(input())

def check(s):
    Set = {s[0], s[1]}
    for i in range(0, len(s)-2):
        if s[i] != s[i+2]: return False
        Set.add(s[i])
    if len(Set) != 2: return False
    return True

while t>0:
    t-=1
    s = input()
    if check(s): print("YES")
    else: print("NO")