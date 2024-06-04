n, m = [int(x) for x in input().split()]
a = sorted({int(x) for x in input().split()})
b = sorted({int(x) for x in input().split()})
print('YES' if a == b else 'NO')