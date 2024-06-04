from datetime import datetime
sub = {}
class DS:
    def __init__(self, ma, mamh, ngay, gio, nhom):
        self.ma = ma
        self.mamh = mamh
        self.ten = sub.get(mamh)
        self.str_tg = ngay + ' ' + gio + ' ' + nhom
        self.tg = datetime.strptime(ngay + ' ' + gio, "%d/%m/%Y %H:%M")

    def outptut(self):
        print(f"{self.ma} {self.mamh} {self.ten} {self.str_tg}")    

n, m = [int(x) for x in input().split()]
for _ in range(n):
    ma, ten = input(), input()
    sub[ma] = ten
arr = []
for i in range(m):
    tmp = [x for x in input().split()]
    arr.append(DS("T{:03d}".format(i+1), tmp[0], tmp[1], tmp[2], tmp[3]))
arr = sorted(arr, key = lambda x : (x.tg, x.ma))
for x in arr:
    x.outptut()