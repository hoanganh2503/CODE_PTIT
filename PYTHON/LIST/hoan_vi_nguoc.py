from itertools import permutations as p
t = int(input())

while t > 0:
    t-=1
    s = ''
    n = int(input())
    for i in range(1, n+1):
        s+= str(i)
    ans = list(p(s))
    print(len(ans))
    for i in ans[::-1]:
        for j in i:
            print(j, end='')
        print(' ', end='')
    print()