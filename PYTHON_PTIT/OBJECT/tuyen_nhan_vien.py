class DS:
    def __init__(self, id, name, d1, d2):
        self.id = id
        self.name = name
        d1 = d1/10 if d1 > 10 else d1
        d2 = d2/10 if d2 > 10 else d2
        self.tb = (d1+d2)/2
        if self.tb < 5: self.tt = "TRUOT"
        elif self.tb < 8: self.tt = "CAN NHAC"
        elif self.tb < 9.5: self.tt = "DAT"
        else: self.tt = "XUAT SAC"
        
    
    def output(self):
        formatted_tb = "{:.2f}".format(self.tb)
        print(f"{self.id} {self.name} {formatted_tb} {self.tt}")

arr = []
for i in range(int(input())):
    id = "TS0" + str(i)
    a = DS(id, input(), float(input()), float(input()))
    arr.append(a)
ans = sorted(arr, key=lambda x: -x.tb)
for i in ans:
    i.output()

