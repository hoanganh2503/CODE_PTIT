class TS:
    def __init__(self, name, birthday, d1, d2, d3):
        self.name = name
        self.birthday = birthday
        self.d1 = d1
        self.d2 = d2
        self.d3 = d3
    def output(self):
        print(f"{self.name} {self.birthday} {(self.d1 + self.d2 + self.d3):.1f}")

a = TS(input(), input(), float(input()), float(input()), float(input()))
a.output()