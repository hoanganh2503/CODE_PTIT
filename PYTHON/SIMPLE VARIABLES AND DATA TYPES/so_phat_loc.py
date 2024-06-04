t = int(input())

while t > 0:
    t -= 1
    s = input()
    if(s[len(s)-2:len(s)] == '86'): print("YES")
    else: print("NO")