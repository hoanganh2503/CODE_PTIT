arr = []
n = int(input())
for i in range(n):
    a = [int(x) for x in input().split()]
    arr.append(a)

tren = duoi = 0
k = int(input())
for i in range(n):
    for j in range(n):
        if i > j: duoi += arr[i][j]
        if i < j: tren += arr[i][j]

if abs(tren - duoi) <= k: print("YES")
else: print("NO")
print(abs(tren -duoi))