lt = {'0': 1, '1': 1, '2': 2, '3': 6, '4': 24, '5': 120, '6': 720, '7': 5040, '8': 40320, '9': 362880}

def check(s):
    ans = 0
    for x in s:
        ans += lt.get(x)
    return ans == int(s)

for _ in range(int(input())):
    if check(input()): print('Yes')
    else: print('No')