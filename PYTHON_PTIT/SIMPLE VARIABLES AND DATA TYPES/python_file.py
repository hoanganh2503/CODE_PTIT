def check(s):
    a, b = s.split('.')
    if b != 'py': return 'no'
    for x in a:
        if x not in ['.', '_'] and x.isalpha() == False: return 'no'
    return 'yes'

print(check(input().lower()))