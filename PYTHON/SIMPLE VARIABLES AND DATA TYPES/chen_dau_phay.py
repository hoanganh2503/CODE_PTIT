s = input()
ans = ''
for i in range(len(s) -3, 0, -3):
    s = s[:i] + ',' + s[i:]
print(s)