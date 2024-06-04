s = input()
if len(s)%2 == 1: s = s[:len(s)-1]
lt = []
for i in range(int(len(s)/2)):
    if int(s[2*i:2*i+2]) not in lt: lt.append(int(s[2*i:2*i+2]))
print(*lt)