with open("CONTACT.in") as f:
    lt = []
    if f.readable():
        for line in f.readlines():
            lt.append(line.lower().strip())
    ans = []
    lt.sort()
    for x in lt:
        if x not in ans:
            ans.append(x)
    print(*ans, sep='\n')
