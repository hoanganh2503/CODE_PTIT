t = int(input())

sequence = [0, 1]

def fibo():
    while(len(sequence) < 93):
        sequence.append(sequence[len(sequence)-1] + sequence[len(sequence)-2])

while t > 0:
    t -= 1
    fibo()
    a, b = input().split()
    for i in range(int(a), int(b)+1):
        print(sequence[i], end=' ')
    print()