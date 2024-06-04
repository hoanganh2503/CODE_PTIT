from itertools import combinations
import math
n = int(input())
st = sorted([int(x) for x in input().split()])
for i in combinations(st, 2):
    if math.gcd(i[1], i[0]) == 1:
        print(*i, sep=' ')