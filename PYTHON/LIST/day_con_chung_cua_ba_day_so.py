for _ in range(int(input())):
    s = input()
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]
    c = [int(x) for x in input().split()]
    check = False
    x, y, z = 0, 0, 0
    while x < len(a) and y < len(b) and z < len(c) :
        if a[x] == b[y] and b[y] == c[z] :
            print(a[x], end = ' ')
            check = True
            x += 1
            y += 1
            z += 1
        elif a[x] < b[y] : x += 1
        elif b[y] < c[z] : y += 1
        elif c[z] < a[x] : z += 1
    if check == False: print('NO')
    else: print()