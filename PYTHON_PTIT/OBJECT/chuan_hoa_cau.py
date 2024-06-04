ans = []

while True:
    try:
        s = input().lower().strip()
        x = ''
        for i in s:
            if i in '.!?':
                x = x.strip()
                if len(x) > 0:
                    x += i
                    ans.append(x)
                x = ''
            else:
                x += i
        x = x.strip()
        if len(x) > 0:
            ans.append(x)
    except Exception:
        break

for x in ans:
    s = x.split()
    res = ''
    for j in s:
        if len(j) > 0:
            res += j + ' '
    res = res[:len(res) - 1]
    if res[-1] not in '.!?':
        res += '.'
    res = res.capitalize()
    print(res)