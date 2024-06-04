for i in range(int(input())):
    s = input()
    lt = []
    i = 0
    while i < len(s):
        s1 = ''
        while(i < len(s) and s[i].isdigit()):
            s1 += s[i]
            i+=1
        i+=1
        if s1 != '': lt.append(int(s1))
    print(sorted(lt)[0])