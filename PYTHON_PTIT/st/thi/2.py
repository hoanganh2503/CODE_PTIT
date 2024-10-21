def euclidean(x, y):
    ans = 0
    for i in range(len(x)):
        ans += (x[i] - y[i]) ** 2
    return ans ** 0.5

def manhattan(x, y):
    ans = 0
    for i in range(len(x)):
        ans += abs(x[i] - y[i])
    return ans

def jaccard(x, y):
    return len(set(x) & set(y)) / len(set(x) | set(y))

def minkowski(x, y):
    p = len(x)
    return (sum((abs(a - b)**p) for a, b in zip(x, y)))**(1/p)
for _ in range(int(input())):
    name = input()
    x = [int(a) for a in input().strip().split()]
    y = [int(a) for a in input().strip().split()]
    if len(x) != len(y):
        print('Invalid')
    else:
        if name == 'euclidean':
            print(f"{euclidean(x, y):.5f}")
        elif name == 'manhattan':
            print(f"{manhattan(x, y):.5f}")
        elif name == 'jaccard':
            print(f"{jaccard(x, y):.5f}")
        elif name == 'minkowski':
            print(f"{minkowski(x, y):.5f}")
        else:
            print('Invalid')