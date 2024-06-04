t = int(input())
while t>0:
    t-=1
    s = input()
    check = True
    for i in range(1000):
        if int(s) % 7 == 0:
            print(s)
            check = False
            break
        s = str(int(s) + int(s[::-1]))
    if check: print(-1)