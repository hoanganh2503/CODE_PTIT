n, m = [int(x) for x in input().split()]
a = sorted({int(x) for x in input().split()})
b = sorted({int(x) for x in input().split()})
ans1 = [x for x in a if x in b]
ans2 = [x for x in a if x not in ans1]
ans3 = [x for x in b if x not in ans1]
print(*ans1)
print(*ans2)
print(*ans3)