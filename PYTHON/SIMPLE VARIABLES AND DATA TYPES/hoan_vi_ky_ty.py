from itertools import permutations
a = list(permutations([i for i in input()]))
for i in a: print(*i, sep='')