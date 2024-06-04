mp = {'8': 'o', '16':'x'}
four = {'00': '0', '01': '1', '10': '2', '11': '3'}
with open('DATA1.in') as f:
    arr = f.read().split('\n')
for i in range(int(arr[0])):
    coso = arr[2*(i+1)-1]
    giatr = arr[2*(i+1)]
    if coso == '2': print(giatr)
    elif coso == '4': 
        if len(giatr) % 2 == 1: giatr = '0' + giatr
        s = ''
        for j in range(len(giatr)- 2, -1 , -2):
            s = four[giatr[j:j+2]] + s
        print(s)
    else:
        dec = int(giatr, 2)
        print(format(dec, mp.get(coso)).upper())