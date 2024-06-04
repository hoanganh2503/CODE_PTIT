t = int(input())

while t > 0:
    t-=1
    s = input()
    if(s[0:2] == s[len(s)-2:len(s)]): print("YES")
    else: print("NO")