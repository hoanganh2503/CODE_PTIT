from itertools import combinations
n, k = [int(i) for i in input().split()]
lt = list({x for x in input().split()})
lt.sort()

for i in combinations(lt, k):
    print(*i, sep=' ')