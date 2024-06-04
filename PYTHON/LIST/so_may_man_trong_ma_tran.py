n, m = [int(x) for x in input().split()]
arr = []
max = -10001
min = 10001
for i in range(n):
    a = [int(x) for x in input().split()]
    for x in a:
        if x < min: min = x
        if x > max: max = x
    arr.append(a)

check = False
for i in range(n):  
    for j in range(m):
        if arr[i][j] == max-min:
            check = True
            break
if check == False: print('NOT FOUND')
else :
    print(max-min)
    for i in range(n):  
        for j in range(m):
            if arr[i][j] == max-min:
                print(f"Vi tri [{i}][{j}]")

