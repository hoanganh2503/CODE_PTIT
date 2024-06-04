sub ={'A': "TOAN", 'B': "LY", 'C': "HOA"}
ut ={'1': 2.0, '2': 1.5, '3': 1.0, '4': 0}
class DS:
    def __init__(self, ma, ten, khoi, d1, d2):
        self.ma = ma
        self.ten = ten
        self.khoi = sub.get(khoi[0])
        self.diem = float(d1)*2 + float(d2) + ut.get(khoi[1])
        if self.diem >= 18: self.tt = "TRUNG TUYEN"
        else: self.tt = "LOAI"
    def output(self):
        print(f"{self.ma} {self.ten} {self.khoi} {self.diem} {self.tt}")

arr = []
for i in range(int(input())):
    a = DS("GV{:02d}".format(i+1), input().strip(), input().strip(), input().strip(), input().strip())
    arr.append(a)
arr = sorted(arr, key=lambda x : (-x.diem, x.ma))
for i in arr:
    i.output()