class DS:
    def __init__(self, ma, tl, ngay, ngay_sort, ten, sl):
        self.ma = ma
        self.tl = tl
        self.ngay = ngay
        self.ngay_sort = ngay_sort
        self.ten = ten
        self.sl = sl
    def output(self):
        print(f"{self.ma} {self.tl} {self.ngay} {self.ten} {self.sl}")

n, m = [int(x) for x in input().split()]
tl = []
arr = []
for i in range(n):
    tl.append(input())
for i in range(m):
    matl, ngay, ten, sl = input(), input(), input(), int(input())
    tentl = tl[int(matl[2:])-1]
    ma = "P{:03d}".format(i+1)
    tmp_ngay = ngay.split('/')
    # ngay_sort = tmp_ngay[2] + '/' + tmp_ngay[1] + '/' + tmp_ngay[0]
    ngay_sort = int(tmp_ngay[2])*10000 + int(tmp_ngay[1])*100 + int(tmp_ngay[0])
    a = DS(ma, tentl, ngay, ngay_sort, ten, sl)
    arr.append(a)

ans = sorted(arr, key=lambda x: x.ngay_sort)

for i in ans:
    i.output()