with open("DATA1.in") as f1:
    arr1 = set(f1.read().lower().split())
with open("DATA2.in") as f1:
    arr2 = set(f1.read().lower().split())
print(' '.join(sorted(arr1.difference(arr2))))
print(' '.join(sorted(arr2.difference(arr1))))