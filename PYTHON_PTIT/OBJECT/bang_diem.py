from decimal import Decimal as D, ROUND_HALF_UP
class HS:
    def __init__(self, id, name, avg):
        self.id = id
        self.name = name
        self.avg = avg
        if avg >= 9: self.status = "XUAT SAC"
        elif avg >= 8.5: self.status = "GIOI"
        elif avg >= 7: self.status = "KHA"
        elif avg >= 5: self.status = "TB"
        else : self.status = "YEU"
    
    def output(self):
        print(f"{self.id} {self.name} {(self.avg)} {self.status}")

arr = []
for i in range(int(input())):
    name = input()
    a = [D(i) for i in input().split()]
    a.append(a[0])
    a.append(a[1])
    avg = (sum(a) / D('12')).quantize(D('0.1'), rounding=ROUND_HALF_UP)
    tmp = HS('HS{:02}'.format(i+1), name, avg)
    arr.append(tmp)

arr.sort(key = lambda x: (-x.avg, x.id))
for i in arr: i.output()
            