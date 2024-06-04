n = int(input())
ans = {}
for i in range(n-1):
    a, b = [int(i) for i in input().split()]
    if a in ans: ans[a] +=1
    else: ans[a] = 1
    if b in ans: ans[b] +=1
    else: ans[b] = 1
check = 'No'
for i in ans:
    if ans[i] >= n-1: check = "Yes"
print(check)