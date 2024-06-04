import re
def formatTen(s):
    s1 = [x[0].upper() + x[1:].lower() for x in re.split(r'\s+', s)]
    ans = ''
    for x in s1:
        ans += x + " "
    return ans

class DS:
    def __init__(self, ma, ten, diem , dt, kv):
        self.ma = ma
        self.ten = formatTen(ten.strip())  
        self.diem = diem
        if dt != "Kinh": self.diem += 1.5
        if kv == 1: self.diem += 1.5
        elif kv == 2: self.diem += 1
        if self.diem >= 20.5: self.tt = "Do"
        else: self.tt = "Truot"
    
    def output(self):
        print(f"{self.ma} {self.ten}{self.diem:.1f} {self.tt}")


arr = []
for i in range(int(input())):
    a = DS("TS{:02d}".format(i+1), input(), float(input()), input(), int(input()))
    arr.append(a)

ans = sorted(arr, key=lambda x: (-x.diem, x.ma))
for x in ans:
    x.output()