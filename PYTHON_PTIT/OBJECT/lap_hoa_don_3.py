class DS:
    def __init__(self, ma, ten, sl, dg, ck):
        self.ma = ma
        self.ten = ten
        self.sl = sl
        self.dg = dg
        self.ck = ck
        self.tt = dg*sl -ck
    def output(self):
        print(f"{self.ma} {self.ten} {self.sl} {self.dg} {self.ck} {self.tt}")

arr = []
for _ in range(int(input())):
    a = DS(input(), input(), int(input()), int(input()), int(input()))
    arr.append(a)

ans = sorted(arr, key=lambda x: (-x.tt))

for i in ans:
    i.output()