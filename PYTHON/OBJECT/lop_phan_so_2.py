from math import gcd
class PS:
    def __init__(self, ts, ms):
        self.ts = ts
        self.ms = ms
    def add(self, other):
        self.ts = self.ts*other.ms + other.ts*self.ms
        self.ms *= other.ms

    def output(self):
        ucln = gcd(self.ts, self.ms)
        return f"{int(self.ts/ucln)}/{int(self.ms/ucln)}"
    
if  __name__ == "__main__":
    x, y, z, t = input().split()
    a = PS(int(x), int(y))
    b = PS(int(z), int(t))
    a.add(b)
    print(a.output())