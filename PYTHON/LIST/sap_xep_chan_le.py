n = int(input())
lt = []
while len(lt) < n:
    for i in input().split():
        lt.append(int(i))
even = []
old = []
for x in lt:
    if x%2 == 0: even.append(x)
    else: old.append(x)
even.sort()
old = sorted(old, key=lambda x: -x)
a = 0
b = 0
for i in lt:
    if i % 2 == 0:
        print(even[a], end=' ')
        a+=1
    else:
        print(old[b], end=' ')
        b+=1