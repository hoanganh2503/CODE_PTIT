for i in range(int(input())):
    n = int(input())
    lt = [int(x) for x in input().split()]
    st, ans = [], [0] * n

    for i in range(n):
        while(len(st) != 0 and lt[st[-1]] <= lt[i]): st.pop()
        ans[i] = i + 1 if len(st) == 0 else i - st[-1]
        st.append(i)
    print(*ans)