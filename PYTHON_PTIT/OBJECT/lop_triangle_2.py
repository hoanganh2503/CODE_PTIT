from math import sqrt

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def distance(self, other):
        return sqrt((other.x - self.x)**2 + (other.y - self.y)**2 )
    
class TRIANGLE:
    def __init__(self, p1, p2, p3):
        self.p1 = p1
        self.p2 = p2
        self.p3 = p3
    def output(self):
        a = self.p1
        b = self.p2
        c = self.p3
        x = a.distance(b)
        y = a.distance(c)
        z = b.distance(c)
        if x + y <= z or x + z <= y or y + z <= x:
            return 'INVALID'
        else: return f"{(sqrt((x+y+z)*(x+y-z)*(-x+y+z)*(x-y+z))/4):.2f}"
    
a = []
t = int(input())
for x in range(t):
    a += [float(i) for i in input().split()]
i = 0
for index in range(t):
    triagle = TRIANGLE(Point(a[i], a[i+1]), Point(a[i+2], a[i+3]), Point(a[i+4], a[i+5]))
    print(triagle.output())
    i += 6