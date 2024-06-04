for _ in range(int(input())):
    number = 0
    ans = []
    for i in input():
        if i.isnumeric(): number += int(i)
        else: ans.append(i)
    ans.sort()
    print(*ans, sep ='', end = '')
    print(number)