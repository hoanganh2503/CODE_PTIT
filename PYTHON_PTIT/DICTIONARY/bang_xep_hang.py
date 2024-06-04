class BXH:
    def __init__(self, name, accepted, submitted):
        self.name = name
        self.accepted = accepted
        self.submitted = submitted

    def __ans__(self):
        print(f"{self.name} {self.accepted} {self.submitted}")
list = []
for _ in range(int(input())):
    name = input()
    a, b = [int(x) for x in input().split()]
    list.append(BXH(name, a, b))
ans = sorted(list, key = lambda x: (-x.accepted, x.submitted, x.name))
for x in ans:
    x.__ans__()