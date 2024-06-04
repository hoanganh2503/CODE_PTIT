class DS:
    def __init__(self, msv, ten, lop) -> None:
        self.msv = msv
        self.ten = ten
        self.lop = lop

    def diemdanh(self, ds):
        diem = 10
        for i in ds:
            if i == 'm' : diem -= 1
            if i == 'v' : diem -= 2 
        if diem <= 0 : self.tt = "0 KDDK"
        else: self.tt = str(diem)

    def output(self):
        print(f"{self.msv} {self.ten} {self.lop} {self.tt}")
    
arr = []
n = int(input())
for _ in range(n):
    a = DS(input(), input(), input())
    arr.append(a)

for _ in range(n):
    msv, ds = [x for x in input().split()]
    for x in arr:
        if x.msv == msv: x.diemdanh(ds)

for i in arr:
    i.output()

