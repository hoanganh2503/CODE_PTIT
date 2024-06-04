t = int(input())

def check(s):
    if(len(s) %2 ==  1): return False
    for x in s:
        if int(x)%2 == 1 : return False
    return s == s[::-1] 

while t > 0:
    t -= 1
    n = int(input())
    for i in range(22, n, 2):
        s = str(i)
        if check(s):
            print(s, end=' ')
    print()