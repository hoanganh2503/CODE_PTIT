while True:
    n = int(input())
    if n == 0: break
    lt = []
    for _ in range(n):
        lt.append(int(input()))
    print(f"{min(lt)} {max(lt)}" if min(lt) != max(lt) else "BANG NHAU")
