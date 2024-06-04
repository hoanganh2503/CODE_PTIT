import math
def check(n):
    if n == 2 or n == 3:
        return True
    if n < 5 or n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(math.sqrt(n)+1), 6):
        if n % i == 0 or n % (i+2) == 0:
            return False
    return True

for i in range(int(input())):
    n = int(input())
    lt = []
    for j in range(13, n):
        tmp = str(j)
        if int(tmp[::-1]) < n and tmp != tmp[::-1] and check(int(tmp)) and check(int(tmp[::-1])) and tmp not in lt:
            print(j, tmp[::-1], end = ' ')
            lt += [tmp, tmp[::-1]]
    print()