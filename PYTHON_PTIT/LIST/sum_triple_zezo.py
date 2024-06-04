for i in range(int(input())) :
    n = int(input())
    lt = sorted([int(x) for x in input().split()])
    cnt = 0
    for i in range(n-2):
        r = n-1
        l = i+1
        while l < r:
            a = lt[i] + lt[r] + lt[l]
            if not a:
                cnt+=1
                l+=1
            elif a < 0: l+=1
            else: r -= 1
    print(cnt)