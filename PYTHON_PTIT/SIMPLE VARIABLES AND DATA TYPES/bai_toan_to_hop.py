from itertools import combinations

n, k = [int(x) for x in input().split()]
lt = sorted({int(i) for i in input().split()})
for i in list(combinations(lt, k)):
    print(*i, sep=' ')