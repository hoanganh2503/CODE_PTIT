arr = {}
def tinh(s1, s2):
    a, b = [int(x) for x in s1.split(":")]
    c, d = [int(x) for x in s2.split(":")]
    return (c*60+d) - (a*60+b)
for i in range(int(input())):
    ma = "T{:02d}".format(i+1)
    ten = input()
    phut = tinh(input(), input())
    mua = int((input()))
    a = [ma, phut, mua]
    if ten in arr:
        m, p, m = arr.get(ten)
        k = arr.get(ten)[0]
        temp = [k, p+phut, m + mua]
        # print(temp)
        arr[ten] = temp
    else:
        arr[ten] = a

for i in arr:
    ans = arr.get(i)
    print(f"{ans[0]} {i} {ans[2]/(ans[1]/60):.2f}")
