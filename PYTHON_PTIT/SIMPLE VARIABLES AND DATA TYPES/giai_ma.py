t = int(input())

while t > 0:
    t -= 1
    s = input()
    for i in range(0, len(s), 2):
        for j in range(int(s[i+1])): print(s[i], end='')
    print()