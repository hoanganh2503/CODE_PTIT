def check(s1, s2):
    a = sorted([int(i) for i in s1.split()])
    b = sorted([int(i) for i in s2.split()])
    for i in range(len(a)):
        if a[i] > b[i]: return "NO"
    return "YES"
t = int(input())
while t>0:
    t-=1
    n = int(input())
    print(check(input(), input()))