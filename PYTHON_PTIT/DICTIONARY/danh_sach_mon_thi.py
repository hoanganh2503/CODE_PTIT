class DS:
    def __init__(self, ma, ten, thi):
        self.ma = ma
        self.ten = ten
        self.thi = thi
    def output(self):
        print(f"{self.ma} {self.ten} {self.thi}")

arr = []
for _ in range(int(input())):
    a = DS(input(), input(), input())
    arr.append(a)
ans = sorted(arr, key=lambda x: x.ma)
for i in ans:
    i.output()