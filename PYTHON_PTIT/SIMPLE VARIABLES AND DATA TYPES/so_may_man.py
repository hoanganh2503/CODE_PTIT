s = input()
cnt = 0
for x in s:
    if(x == '4' or x == '7'): cnt+=1
if(cnt == 4 or cnt == 7): print("YES")
else: print("NO")