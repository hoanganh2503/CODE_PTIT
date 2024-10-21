def normalize_name(name):
    return list(name.capitalize() for name in name.strip().split())

for _ in range(int(input())):
    n = int(input())
    s = normalize_name(input())
    if n == 1:
        ten = s[-1]
        ho = ' '.join(s[:-1])
        print(ten + ' ' + ho)
    else:
        ho = s[0]
        ten = ' '.join(s[1:])
        print(ten + ' ' + ho)