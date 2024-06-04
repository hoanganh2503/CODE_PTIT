for j in range(int(input())):
    s1 = input()
    s2 = input()
    st = set()
    for i in s1:
        st.add(i)
    ans = 'YES'
    for i in st:
        if i not in s2 or s1.count(i) != s2.count(i):
            ans = 'NO'
            break
    print(f"Test {j+1}: {ans}")