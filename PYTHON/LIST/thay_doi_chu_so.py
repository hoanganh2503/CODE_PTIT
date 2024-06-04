for i in range(int(input())):
    a,b = sorted([x for x in input().split()])
    lt = []
    while len(lt) < 2:
        tmp = [x for x in input().split()]
        for x in tmp: lt.append(x)
    s1, s2 = lt[0], lt[1]
    print(int(s1.replace(b, a))+int(s2.replace(b, a)), end=' ')
    print(int(s1.replace(a, b))+int(s2.replace(a, b)))