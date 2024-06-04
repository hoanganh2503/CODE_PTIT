t = int(input())

def check(s):
    if len(s) < 3: return False
    tmp = 0
    chk = True
    for i in range(1, len(s)):
        if s[i] == s[i-1]: return False
        if s[i] < s[i-1]:
            tmp = i
            chk = False
            break
    if chk: return False
    chk = True
    for i in range(tmp, len(s)-1):
        if s[i] <= s[i+1]:
            chk = False
            return False
    if tmp == 1 and chk: return False
    return True

while t>0:
    t-=1
    s = input()
    if check(s): print("YES")
    else: print("NO")