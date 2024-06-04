arr = []
with open("DATA.in", "r") as f:
    if f.readable():
        for line in f.readlines():
            [arr.append(i) for i in line.split()]
ans = []
for i in arr:
    try:
        a = int(i)
        if a > 2147483647 or a < -2147483648:
            ans.append(i)
    except ValueError:
        ans.append(i)
ans.sort()
print(*ans)