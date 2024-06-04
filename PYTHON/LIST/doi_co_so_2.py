conversion_dict = {'00': '0', '01': '1', '10': '2', '11': '3'}

# def convertToQuaternary(s):
#     ans = ''
#     for i in range(len(s)-2, -1, -2):
#         tmp = s[i:i+2]
#         tmp = '0' + tmp if len(tmp) == 1 else tmp
#         print(tmp)
#     return ans
def convertToQuaternary(s):
    ans = ''
    s = '0' + s if len(s) %2  == 1 else s
    for i in range(len(s)-2, -1, -2):
        ans = conversion_dict[s[i:i+2]] + ans
    return ans

mp = {8:'o', 16:'x'}
for i in range(int(input())):
    n = int(input())
    if n == 2: 
        print(input())
        continue
    if(n == 4):
        print(convertToQuaternary(input()))
        continue
    decimal = int(input(), 2)
    print(format(decimal, mp.get(n)).upper())