n, m = [int(x) for x in input().split()]
arr = []
check = [[0 for _ in range(m)] for _ in range(n)]
for i in range(n):
    arr.append([int(x) for x in input().split()])
ans = 0
for i in range(n):
    for j in range(m):
        if arr[i][j] == -1:
            if i - 1 >= 0 and check[i-1][j] == 0:
                ans += arr[i-1][j]
                check[i-1][j] = 1
            if i + 1 < n and check[i+1][j] == 0:
                ans += arr[i+1][j]
                check[i+1][j] = 1
            if j - 1 >= 0  and check[i][j-1] == 0:
                ans += arr[i][j-1]
                check[i][j-1] = 1
            if j + 1 < m  and check[i][j+1] == 0:
                ans += arr[i][j+1]
                check[i][j+1] = 1
            if i - 1 >= 0 and j - 1 >= 0 and check[i-1][j-1] == 0:
                ans += arr[i-1][j-1]
                check[i-1][j-1] = 1
            if i + 1 < n and j + 1 < m and check[i+1][j+1] == 0:
                ans += arr[i+1][j+1]
                check[i+1][j+1] = 1
            if i + 1 < n and j - 1 >= 0 and check[i+1][j-1] == 0:
                ans += arr[i+1][j-1]
                check[i+1][j-1] = 1           
            if i - 1 >= 0 and j + 1 < m and check[i-1][j+1] == 0:
                ans += arr[i-1][j+1]
                check[i-1][j+1] = 1
print(ans)