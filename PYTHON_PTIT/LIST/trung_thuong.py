t = int(input())
while t > 0:
    t-=1
    m = {}
    tmp = 0
    for i in range(int(input())):
        a = int(input())
        if a in m: m[a] +=1
        else: m[a] = 1
        tmp = max(tmp, m[a])
    ans = 1000
    for i in m:
        if m[i] == tmp:
            ans = min(ans, i)
    print(ans)