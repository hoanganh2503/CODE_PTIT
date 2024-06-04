def search(l, h, x, a):
    while(l <= h):
        m = (l+h)//2
        if(a[m] == x): return m+1
        if(a[m] > x): h = m-1
        else: l = m+1
    return "Not in sequence"

myMap = {}
a = []
for i in range(60):
    for j in range(38):
        for z in range(26):
            num = 2 ** i * 3 ** j * 5 ** z
            if num not in myMap:
                myMap[num] = 1
                a.append(num)

a.sort()

for i in range(int(input())):
    x = int(input())
    print(search(0, len(a), x, a))