for _ in range(int(input())):
    s = input()
    if len(s) >= 100:
        ans = s[:100]
        if s[100] == ' ': print(ans)
        else:
            i = 99
            while ans[i] != ' ':
                i-=1
            print(ans[:i])
    else: print(s)