n, m = [int(x) for x in input().split()]
arr = [int(x) for x in input().split()]
st = {}
for i in arr:
    if i in st: st[i] += 1
    else: st[i] = 1
ans1 = sorted(st, key=lambda x: (-st[x], x))
s1 = st[ans1[0]]
while len(ans1) > 0 and st[ans1[0]] == s1:
     ans1.pop(0)
if len(ans1) == 0: print("NONE")
else: print(ans1[0])