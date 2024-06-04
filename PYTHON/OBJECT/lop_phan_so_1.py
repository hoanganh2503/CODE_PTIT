from math import gcd
class PS:
    def __init__(self, ts, ms):
        self.ts = ts
        self.ms = ms
    def output(self):
        ucln = gcd(self.ts, self.ms)
        return f"{int(self.ts/ucln)}/{int(self.ms/ucln)}"
    
if  __name__ == "__main__":
    x, y = input().split()
    a = PS(int(x), int(y))
    print(a.output())