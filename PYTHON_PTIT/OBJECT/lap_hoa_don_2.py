from datetime import datetime
class DS:
    def __init__(self, ma, ten, phong, nhan, tra, ps):
        self.ma = ma
        self.ten = ten
        self.phong = phong
        self.day = (datetime.strptime(tra, '%d/%m/%Y') - datetime.strptime(nhan, '%d/%m/%Y')).days + 1
        gia = 0
        if phong[0] == '1': gia = 25
        elif phong[0] == '2': gia = 34
        elif phong[0] == '3': gia = 50
        else: gia = 80
        self.tong = self.day * gia + int(ps)
    
    def output(self):
        print(f"{self.ma} {self.ten} {self.phong} {self.day} {self.tong}")

arr = []
for i in range(int(input())):
    a = DS("KH{:02d}".format(i+1), input().strip(), input().strip(), input().strip(), input().strip(), input().strip())
    arr.append(a)
arr = sorted(arr, key=lambda x: (-x.tong, x.ma))
for x in arr:
    x.output()