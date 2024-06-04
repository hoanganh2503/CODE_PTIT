s = input()
k = int(input())
if len(s) % 2 == 1: s = s[:len(s)-1]
mp = {}
for i in range(int(len(s)/2)):
    s1 = s[2*i:2*i+2]
    if s1 in mp: mp[s1] +=1
    else: mp[s1] = 1
ans = sorted(mp, key=lambda x:(x, mp[x]))
ans = list(filter(lambda x :mp[x] >= k, ans))
if len(ans) == 0: print("NOT FOUND")
else:
    for i in ans:
        print(f"{i} {mp[i]}")