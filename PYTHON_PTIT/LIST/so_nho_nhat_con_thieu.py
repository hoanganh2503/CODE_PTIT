n = int(input())
lt = sorted([int(x) for x in input().split()])
tmp =0
check = False
for i in range(n-1):
    if lt[i] == lt[i+1] - 1:
        tmp = lt[i+1] + 1
        continue
    print(lt[i]+1)
    check = True
    break
if check == False: print(n+1)