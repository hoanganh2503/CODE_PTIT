import math
class DS:
    def __init__(self, ma, ten, d1, d2, d3):
        self.ma = ma
        lt_ten = ten.lower().strip().split()
        lt = [x[0].upper() + x[1:] for x in lt_ten]
        self.ten = ' '.join(lt)
        self.diem = math.ceil(((d1*3 + d2*3 + d3*2) / 8)*100)/100
    def output(self, tt):
        print(f"{self.ma} {self.ten} {self.diem:.2f} {tt}")

arr = []
for i in range(int(input())):
    arr.append(DS("SV{:02d}".format(i+1), input(), float(input()), float(input()), float(input())))
arr = sorted(arr, key=lambda x:(-x.diem, x.ma))
i = 0
while i < len(arr):
    j = i
    while j < len(arr) and arr[j].diem == arr[i].diem:
        arr[j].output(i+1)
        j += 1
    i = j
    if i < len(arr):
        arr[i].output(i+1)
    i += 1