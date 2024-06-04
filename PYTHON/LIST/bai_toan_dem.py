arr = []
n = int(input())
while len(arr) < n:
    [arr.append(int(x)) for x in input().split()]
arr.sort()
check = True
for i in range(1, max(arr)+1):
    if i not in arr:
        check = False
        print(i)
if check: print('Excellent!')
