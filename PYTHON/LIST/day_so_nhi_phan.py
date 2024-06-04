def check(s):
    a = s.split()
    sum = 0
    for i in range(len(a)-1):
        if a[i] != a[i+1]: sum+=1
    return sum
t = int(input())
print(check(input()))