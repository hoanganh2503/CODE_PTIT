n = int(input())
ans = {}
for _ in range(n):
    s = ''
    for i in input().lower() + ' ':
        if i.isalpha(): s += i
        else:
            if s != '':
                if s in ans:
                    ans[s] += 1
                else: ans[s] = 1
                s = ''
ans = sorted(ans.items(), key=lambda x: (-x[1], x[0]))
for i in ans:
    print(*i)