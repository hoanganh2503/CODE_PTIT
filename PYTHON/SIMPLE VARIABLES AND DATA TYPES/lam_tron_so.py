t = int(input())

while t > 0:
    t-=1
    str1 = input()
    char_list = list(str1)
    for i in range(len(str1) - 1, -1, -1):
        if i > 1:
            if int(char_list[i]) >= 5:
                x = 9 if int(char_list[i-1]) + 1 > 9 else int(char_list[i-1]) + 1
                char_list[i-1] = str(x)
            char_list[i] = '0'
        if i == 1:
            if int(char_list[i]) >= 5:
                char_list[0] = int(char_list[i-1]) + 1
            char_list[i] = '0'
    for i in char_list:
        print(i, end='')
    print()