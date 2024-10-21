def swap_case(s):
    swapped = ""
    for x in s:
        swapped += x.upper() if x.islower() else x.lower()
    return swapped

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)