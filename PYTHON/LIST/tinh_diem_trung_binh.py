n = int(input())
lt = [float(x) for x in input().split()]
a, b  = min(lt), max(lt)
ans = []
for i in lt:
    if i == a or i == b: continue
    ans.append(i)
print("%.2f"%(sum(ans)/len(ans)))