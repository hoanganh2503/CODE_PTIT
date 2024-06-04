s = input()
if len(s)%2 == 1: s = s[:len(s)-1]
mp = {}
for i in range(int(len(s)/2)):
    a = int(s[2*i:2*i+2])
    if a in mp: mp[a] +=1
    else: mp[a] = 1
for i in mp:
    print(f"{i} {mp[i]}")