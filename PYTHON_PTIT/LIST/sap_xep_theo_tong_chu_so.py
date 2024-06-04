import operator
  
for i in range(int(input())):
    n = input()
    a = input().split()
    a.sort(key = lambda x: (sum(int(i) for i in x), int(x)))
    print(*a)