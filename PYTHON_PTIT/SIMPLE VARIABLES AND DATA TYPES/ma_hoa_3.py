p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def rotate(s):
    sum = 0
    for x in s: sum += ord(x)-65
    ans = ""
    for x in s:
        ans += p[(ord(x)-65+sum) % 26]
    return ans

def merge(s1, s2):
    ans = ""
    for i in range(len(s1)):
        ans += p[(ord(s1[i]) -65 + ord(s2[i]) - 65) % 26]
    return ans

for _ in range(int(input())):
    s = input()
    s1 = rotate(s[0:int(len(s)/2)])
    s2 = rotate(s[int(len(s)/2):len(s)])
    print(merge(s1, s2))
    