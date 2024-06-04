n, k= [int(x) for x in input().split()]
ans = {}
for _ in range(n):
    s = ''
    for i in input().lower() + ' ':
        if i.isalnum(): s += i
        else:
            if s != '':
                if s in ans:
                    ans[s] += 1
                else: ans[s] = 1
                s = ''
ans = sorted(ans.items(), key=lambda x: (-x[1], x[0]))
ans1 = dict(filter(lambda x: x[1] >= k, ans))
for i in ans1:
    print(i, ans1[i])