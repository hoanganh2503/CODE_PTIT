p = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ_.'
while True:
    s = input()
    if s == '0': break
    k, s1 = s.split()
    k = int(k)
    ans = ''
    for x in s1:
        ans += p[(p.find(x)+k)%28]
    print(ans[::-1])