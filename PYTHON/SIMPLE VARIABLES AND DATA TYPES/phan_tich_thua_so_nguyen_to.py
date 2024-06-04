t = int(input())

while t > 0:
    t-=1
    n = int(input())
    i = 2
    ans = '1 * '
    while n!=1:
        temp = 0
        while(n%i==0):
            temp+=1
            n/=i
        if(temp != 0):
            ans += str(i) + '^' + str(temp) + ' * '
        i+=1
    print(ans[0:len(ans)-3])