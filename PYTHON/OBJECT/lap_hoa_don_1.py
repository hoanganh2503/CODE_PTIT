class DS:
    def __init__(self, id, name, total):
        self.id = id
        self.name = name
        tong = 0
        if total > 100:
            tong = (50 * 100 + 50 * 150 + (total - 100) * 200) * 1.05
        elif total > 50:
            tong = (50 * 100 + (total - 50) * 150) * 1.03
        else:
            tong = total * 100 * 1.02
        self.tong = round(tong)
    
    def output(self):
        print(f"{self.id} {self.name} {self.tong}")

arr = []
for i in range(int(input())):
    id = "KH{:02d}".format(i+1)
    a = DS(id, input(), (-int(input()) + int(input())))
    arr.append(a)
ans = sorted(arr, key=lambda x: (-x.tong, x.id))
for i in ans:
    i.output()