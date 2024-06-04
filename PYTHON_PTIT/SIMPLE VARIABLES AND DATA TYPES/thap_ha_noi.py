def Try(n, a, b, c):
    if n == 1:
        print(a, "->", b)
        return
    Try(n - 1, a, c, b)
    print(a, "->", b)
    Try(n - 1, c, b, a)

Try(int(input()), 'A', 'C', 'B')