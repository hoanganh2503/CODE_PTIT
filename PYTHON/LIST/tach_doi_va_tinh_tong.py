s = input()
while len(s) > 1:
    a = int(s[:len(s)//2]) + int(s[len(s)//2:])
    print(a)
    s = str(a)