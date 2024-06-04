from math import comb
n = int(input())
arr = []
for i in range(n):
    arr.append([i for i in input()])
ans = 0
for i in range(n):
    c, l = 0, 0
    for j in range(n):
        if arr[i][j] == 'C': c+=1
        if arr[j][i] == 'C': l+=1
    ans+= (comb(c, 2) + comb(l, 2))
print(ans)