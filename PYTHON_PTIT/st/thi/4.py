def checkPass(s):
    if len(s) < 6 or len(s) > 12:
        return False
    if not any(char.isdigit() for char in s):
        return False
    if not any(char.isupper() for char in s):
        return False
    if not any(char.islower() for char in s):
        return False
    if not any(char in '$#@!' for char in s):
        return False
    return s


arr = input().split(',')
ans = []
for x in arr:
    if checkPass(x):
        ans.append(x)
if len(ans) == 0: 
    print("INVALID PASSWORD")
else: 
    print(','.join(ans))