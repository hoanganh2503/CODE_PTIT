s = input()
cnt = 0
while len(s) != 1 or cnt == 0:
    cnt+=1
    s1 = 0
    for i in s:
        s1 += ord(i) - 48
    s = str(s1)
print(cnt)