n = int(input())
arr = [int(x) for x in input().split()]
ans1 = 10**10
ans2 = 0
for i in arr:
    x = 0
    for j in arr:
        x += abs(i - j)
    if x < ans1:
        ans1 = x
        ans2 = i
print(ans1, ans2)