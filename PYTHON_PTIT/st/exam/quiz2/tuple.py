n = int(input())
student_marks = {}

for _ in range(n):
    record = input().split()
    name, marks = record[0], list(map(float, record[1:]))
    student_marks[name] = marks

query_name = input()

average_marks = sum(student_marks[query_name]) / len(student_marks[query_name])

print("{:.2f}".format(average_marks))