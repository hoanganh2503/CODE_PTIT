n = int(input())
arr = []
for _ in range(n):
    arr.append([int(x) for x in input().split()])
k = int(input())
t = 0
d = 0
for i in range(n):
    for j in range(n):
        if i < j: t += arr[i][j]
        elif i > j: d += arr[i][j]

if abs(t-d) <= k: print("YES")
else: print("NO")
print(abs(t-d))