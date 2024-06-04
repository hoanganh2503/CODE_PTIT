class MATRIX:
    def __init__(self, a, n, m):
        self.a = a
        self.n = n
        self.m = m
    def output(self):
        for i in range(self.n):
            for j in range(self.n):
                temp = 0
                for l in range(self.m):
                    temp += self.a[i][l] * self.a[j][l]
                print(temp, end=' ')
            print()

T = int(input())
e = []
while True:
    try: e.extend(map(int, input().split()))
    except: break
I = 0
for t in range(T):
    n, m = e[I], e[I+1]
    I+=2
    a = []
    for i in range(n): a.append([0]*m)
    while len(e) - I < n*m: e.append(0)
    for i in range(n):
        for j in range(m): a[i][j] = e[I+j]
        I+=m
    x = MATRIX(a, n, m)
    x.output()