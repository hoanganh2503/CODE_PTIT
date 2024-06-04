for i in range(int(input())) :
    n, k = [int(x) for x in input().split()]
    lt = [int(x) for x in input().split()]
    for i in range(n):
        print(lt[(i+k)%n], end=' ')
    print()