n = int(input())
arr = []
ans = [0]*n
for i in range(n):
    arr.append([int(x) for x in input().split()])
tmp = arr[n-2][n-1]
for i in range(n-3, -1, -1):
    sum = 0
    for j in range(i+1, n):
        sum += arr[i][j]
    for k in range(i+1, n-2):
        sum -= ans[k]
    sum -= tmp
    ans[i] = int(sum/(n-i-1))  
ans[n-1] = arr[0][n-1] - ans[0]
ans[n-2] = arr[0][n-2] - ans[0]
print(*ans, sep = ' ')