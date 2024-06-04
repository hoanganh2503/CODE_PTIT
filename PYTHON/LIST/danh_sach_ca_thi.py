from datetime import datetime
class DS:
    def __init__(self, id, date, room):
        self.id = id
        self.date = datetime.strptime(date, '%d/%m/%Y %H:%M')
        self.room = room
    def output(self):
        print(f"{self.id} {self.date.strftime('%d/%m/%Y %H:%M')} {self.room}")

ans = []
f = open('CATHI.in', 'r')
for i in range(int(f.readline())):
    a = DS("C{:03d}".format(i+1), f.readline().strip() + ' ' +  f.readline().strip(), f.readline().strip())
    ans.append(a)
ans = sorted(ans, key=lambda a: (a.date, a.id))
for x in ans:
    x.output()