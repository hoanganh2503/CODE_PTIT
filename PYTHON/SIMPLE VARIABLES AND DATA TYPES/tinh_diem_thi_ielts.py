def calculate_band_score(correct_answers):
    if correct_answers >= 39:
        return 9.0
    elif correct_answers >= 37:
        return 8.5
    elif correct_answers >= 35:
        return 8.0
    elif correct_answers >= 33:
        return 7.5
    elif correct_answers >= 30:
        return 7.0
    elif correct_answers >= 27:
        return 6.5
    elif correct_answers >= 23:
        return 6.0
    elif correct_answers >= 20:
        return 5.5
    elif correct_answers >= 16:
        return 5.0
    elif correct_answers >= 13:
        return 4.5
    elif correct_answers >= 10:
        return 4.0
    elif correct_answers >= 7:
        return 3.5
    elif correct_answers >= 5:
        return 3.0
    elif correct_answers >= 3:
        return 2.5
    else:
        return 0.0
    
for _ in range(int(input())):
    arr = [float(x) for x in input().split()]
    ans = (calculate_band_score(arr[0]) + calculate_band_score(arr[1]) + arr[2] + arr[3])/4
    w = ans//1
    mod = ans - w
    if mod < 0.25: print(w)
    elif mod < 0.75: print(w + 0.5)
    else: print(w+1)