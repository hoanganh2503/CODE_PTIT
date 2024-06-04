def handle(s):
    try:
        if s.count('.') != 3: return "NO"
        lt = [int(x) for x in s.split('.')]
        print(lt)
        for x in lt:
            if x < 0 or x > 255: return "NO"
        return "YES"
    except: return "NO"
for _ in range(int(input())):
    print(handle(input()))