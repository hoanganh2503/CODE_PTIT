for _ in range(int(input())):
    n = int(input())
    lt = [int(x) for x in input().split()]
    cnt = 0
    for i in range(min(lt), max(lt)):
        if i not in lt:
            cnt += 1
    print(cnt)