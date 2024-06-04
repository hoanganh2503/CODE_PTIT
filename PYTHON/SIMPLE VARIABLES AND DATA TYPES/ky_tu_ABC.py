def handle(s, n, a, b, c):
    if len(s) == n and a > 0 and a <= b and b <= c:
        print(s)
    if len(s) < n:
        handle(s + 'A', n, a+1, b, c)
        handle(s + 'B', n, a, b+1, c)
        handle(s + 'C', n, a, b, c+1)


n = int(input())
for i in range(3, n+1):
    handle('', i, 0, 0, 0)