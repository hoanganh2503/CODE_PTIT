for _ in range(int(input())):
    n = int(input())
    arr = [int(x) for x in input().split()]
    mp = {}
    for x in arr:
        if x in mp: mp[x] += 1
        else: mp[x] = 1
    for x in mp:
        if mp[x] % 2 == 1:
            print(x)