def check(s):
    return s[0] == s[-1]

for _ in range(int(input())):
    if check(input()): print('YES')
    else: print('NO')