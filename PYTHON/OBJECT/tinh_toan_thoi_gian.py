class DS:
    def __init__(self, id, name, start, end):
        self.id = id
        self.name = name
        a, b = [int(x) for x in start.split(':')]
        c, d = [int(x) for x in end.split(':')]
        self.time = -(a*60+b) + (c*60+d)
        self.hour = self.time//60
        self.minute = self.time%60
    def output(self):
        print(f"{self.id} {self.name} {self.hour} gio {self.minute} phut")
arr = []
for _ in range(int(input())):
    a = DS(input(), input(), input(), input())
    arr.append(a)
ans = sorted(arr, key = lambda x: -x.time)
for i in ans:
    i.output()