def check(a):
    for i in range(len(a)-1):
        if a[i] != a[i+1]: return False
    return True

def handle(a):
    x, b, c, d = a
    a[0] = abs(x-b)
    a[1] = abs(b-c)
    a[2] = abs(c-d)
    a[3] = abs(d-x)

while True:
    s = input()
    if s == '0 0 0 0': break 
    a = [int(x) for x in s.split()]
    cnt = 0
    while check(a) == False:
        handle(a)
        cnt+=1
    print(cnt)