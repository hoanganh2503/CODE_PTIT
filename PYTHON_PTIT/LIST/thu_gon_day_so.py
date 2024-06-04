n = input()
lt = [int(x) for x in input().split()]
check = True
while check:
    check = False
    i = 0
    while i < len(lt):
        if i == len(lt) - 1:
            i += 1
            continue
        if (lt[i] + lt[i + 1]) % 2 == 0:
            lt.pop(i)
            lt.pop(i)
            check = True
            i -= 1
        i += 1
print(len(lt))