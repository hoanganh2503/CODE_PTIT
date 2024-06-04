n, m = [int(x) for x in input().split()]
arr = []
for _ in range(n):
    arr.append([int(x) for x in input().split()])

if n > m:
    a = []
    for i in range(n-m):
        a.append(2*i)
    for i in range(n):
        if i not in a : print(*arr[i])
else:
    a = []
    for i in range(m-n):
        a.append(2*i+1)
    for i in range(n):
        for j in range(m):
            if j in a: continue
            print(arr[i][j], end=' ')
        print()