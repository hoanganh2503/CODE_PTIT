from itertools import combinations

n, k = [int(x) for x in input().split()]
list = sorted(list({int(i) for i in input().split()}))
for i in list(combinations(list, k)):
    print(*i, sep=' ')