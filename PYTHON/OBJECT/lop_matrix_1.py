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

for _ in range(int(input())):
    n, m = [int(i) for i in input().split()]
    a = []
    for i in range(n):
        a.append([int(j) for j in input().split()])
    A = MATRIX(a, n, m)
    A.output()