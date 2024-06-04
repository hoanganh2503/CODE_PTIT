for _ in range(int(input())):
    n, k = [int(x) for x in input().split()]
    s = ''
    tmp = 'A'
    for i in range(int(n)):
        s = s + chr(ord(tmp) + i) + s
    print(s[k-1])
