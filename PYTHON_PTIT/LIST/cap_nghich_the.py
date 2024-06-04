def check(s):
    a = s.split()
    sum = 0
    for i in range(len(a)-1):
        for j in range(i+1, len(a)):
            if int(a[i]) > int(a[j]): sum +=1
    return sum
t = int(input())
print(check(input()))