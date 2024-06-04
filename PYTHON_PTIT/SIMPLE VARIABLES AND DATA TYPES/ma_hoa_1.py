t = int(input())

while t > 0:
    t -= 1
    s = input() + '!'
    i = 0
    while(i < len(s)-1):
        cnt = 1
        while(s[i] == s[i+1]):
            cnt += 1
            i+=1
        print(f'{cnt}{s[i]}', end='')
        i+=1
    print()