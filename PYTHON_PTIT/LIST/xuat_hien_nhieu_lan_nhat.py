t = int(input())
while t > 0:
    t-=1
    n = int(input())
    m = {}
    cnt = 0
    for i in input().split():
        if i in m: m[i] += 1
        else: m[i] = 1
        cnt = max(cnt, m[i])
    ans = 1e9
    for i in m:
        if m[i] == cnt and m[i] > n/2:
            ans = min(ans,int(i))
    if(ans == 1e9): print("NO")
    else: print(ans)