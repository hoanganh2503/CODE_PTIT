import operator
def mul(a):
    ans = 1
    for i in a:
        ans*= int(i)
    return ans    
for i in range(int(input())):
    n = input()
    a = input().split()
    a.sort(key = lambda x: (mul(int(i) for i in x), int(x)))
    print(*a)