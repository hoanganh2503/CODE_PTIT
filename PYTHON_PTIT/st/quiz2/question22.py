cent = 0.01
days = 0
while True:
    days = input("Enter a positive integer: ")
    
    if days.isdigit() and int(days) > 0:
        days = int(days)
        break
    else:
        print("Please enter again, this is not a positive integer.")

print("Day\tCents")
print("------------------------------")
print(f"{1}\t$ {cent:.2f}")
total = 0.01
for day in range(2, days + 1):
    cent *= 2
    total += cent
    print(f"{day}\t$ {cent:.2f}")
print(f"The total savings for {days} is: $ {total:.2f}")