team = {}

class DS:
    def __init__(self, ma, ten, nhom):
        self.ma = ma
        self.ten = ten
        self.nhom = team.get(nhom)
    
    def output(self):
        print(f"{self.ma} {self.ten} {self.nhom}")

for i in range(int(input())):
    team["Team{:02d}".format(i+1)] = input().strip() + ' ' + input().strip()
arr = []
for i in range(int(input())):
    arr.append(DS("C{:03d}".format(i+1), input().strip(), input().strip()))
arr = sorted(arr, key=lambda x : (x.ten, x.ma))
for x  in arr:
    x.output()