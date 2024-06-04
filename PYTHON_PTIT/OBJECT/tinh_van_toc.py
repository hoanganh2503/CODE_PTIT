class DS:
    def __init__(self, ten, donVi, thoiGian) :
        a = [i[0] for i in ten.split()]
        b = [i[0] for i in donVi.split()]
        self.id = ''.join(b) + ''.join(a)
        self.ten = ten
        self.donVi = donVi
        c = thoiGian.split(':')
        self.vanToc = 120 / (int(c[0]) - 6 + int(c[1]) / 60)

    def output(self) :
        print( f"{self.id} {self.ten} {self.donVi} {round(self.vanToc)} Km/h")

arr = []
for _ in range(int(input())):
    a = DS(input(), input(), input())
    arr.append(a)
ans = sorted(arr, key=lambda x: -x.vanToc)
for x in ans:
    x.output()
