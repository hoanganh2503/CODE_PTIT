n = int(input())
arr = [int(x) for x in input().split()]
arr.sort()
print(max([arr[0]*arr[1],
           arr[n-1]*arr[n-2],
           arr[n-1]*arr[n-2]*arr[n-3],
           arr[0]*arr[1]*arr[n-1]]))