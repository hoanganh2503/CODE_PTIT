import re
import sys
import heapq

for _ in range(int(sys.stdin.readline())):
	n = int(sys.stdin.readline())
	s1 = input()
	line = ' ' + s1.replace(' ','  ') + ' '
	a, i, ans = [], -8, 0
	while len(a) < 4 and i < 9:
		s = '\d' * abs(i) + ' '
		if i<0: s = '-' + s
		elif i>0: s = ' ' + s
		else:
			i+=1
			continue
		a += [int(x) for x in re.findall(s,line)]
		i+=1

	for x in heapq.nsmallest(3,a):
		ans+=x
	print(ans)