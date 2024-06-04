t = int(input())

def check(s):
    sum = 0
    for i in range(len(s)):
        if i < len(s) - 1 and abs(int(s[i]) - int(s[i + 1])) != 2: return False
        sum += int(s[i])
    if sum % 10  == 0: return True
    return False

while t > 0:
    t-=1
    s = input()
    if(check(s)): print("YES")
    else: print("NO")