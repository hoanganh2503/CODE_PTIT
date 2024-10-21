for _ in range(int(input())):
    le = 1
    tong = 0
    s = input()
    for i in range(len(s)):
        if i % 2 == 0:
            le *= int(s[i])
        else:
            tong += int(s[i])
    if tong == 0: 
        print("INVALID")
    else:
        print(f"{le/tong:.6f}")