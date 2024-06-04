cnt = 0
ans = set()
while cnt < 10:
    a = [int(i) for i in input().split()]
    cnt += len(a)
    for x in a:
        ans.add(x%42)
print(len(ans))
