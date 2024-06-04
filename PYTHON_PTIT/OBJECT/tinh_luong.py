mp = {}
class DS:
    def __init__(self, ma, ten, luongngay, cong):
        self.ma = ma
        self.ten = ten
        self.phong = mp[ma[-2:]]
        nhom = ma[0]
        nam = int(ma[1:3])
        self.heso = 0
        if nhom == "A":
            if nam <= 3:
                self.heso = 10
            elif nam <= 8:
                self.heso = 12
            elif nam <= 15:
                self.heso = 14
            else:
                self.heso = 20
        if nhom == "B":
            if nam <= 3:
                self.heso = 10
            elif nam <= 8:
                self.heso = 11
            elif nam <= 15:
                self.heso = 13
            else:
                self.heso = 16
        if nhom == "C":
            if nam <= 3:
                self.heso = 9
            elif nam <= 8:
                self.heso = 10
            elif nam <= 15:
                self.heso = 12
            else:
                self.heso = 14
        if nhom == "D":
            if nam <= 3:
                self.heso = 8
            elif nam <= 8:
                self.heso = 9
            elif nam <= 15:
                self.heso = 11
            else:
                self.heso = 13
        self.luong = self.heso * luongngay * cong * 1000
    def output(self):
        print(f"{self.ma} {self.ten} {self.phong} {self.luong}")



for _ in range(int(input())):
    s = input()
    ma, ten = s[:2], s[3:]
    mp[ma] = ten
arr = []
for _ in range(int(input())):
    a = DS(input(), input(), int(input()), int(input()))
    arr.append(a)
for x in arr:
    x.output()