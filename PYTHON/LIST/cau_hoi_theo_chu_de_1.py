ans = {}
n = int(input())
k = 0
while k < n:
        key = input()
        k+=1
        cnt = 0
        s = '_'
        while len(s) != 0:
            cnt += 1
            if k == n: break
            s = input()
            k+=1
        ans[key] = cnt-1
for x in ans:
      print(f"{x}: {ans.get(x)}")
