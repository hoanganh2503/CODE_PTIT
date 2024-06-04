car = {'Xe_con5': 10000, 'Xe_con7': 15000, 'Xe_tai2': 20000, 'Xe_khach29': 50000, 'Xe_khach45': 70000}
ans = {}
for _ in range(int(input())):
    arr = input().split()
    if arr[3] == 'OUT': continue
    if arr[4] not in ans: ans[arr[4]] = car[arr[1] + arr[2]]
    else: ans[arr[4]] += car[arr[1] + arr[2]]
for x in ans:
    print(f"{x}: {ans[x]}")