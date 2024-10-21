def getUserInputInt(prompt):
    while True:
        try:
            user_input = int(input(prompt))
            if user_input < 0:
                print("Number must be positive.")
                continue
            return user_input
        except ValueError:
            print("Invalid input. Please enter an integer.")

def validatePercentageInput(prompt):
    while True:
        user_input = input(prompt).strip() 
        if user_input.endswith("%"):
            numeric_value = user_input[:-1]
            try:
                percentage = float(numeric_value)
                if 0 <= percentage <= 100:
                    return percentage / 100
                else:
                    print("Percentage must be between 0 and 100.")
            except ValueError:
                print("Invalid input. Please enter a valid percentage.")
        else:
            print("Invalid input format. Please enter a percentage value ending with '%'.")

number_organisms = getUserInputInt("Starting number of organisms: ")
percentage = validatePercentageInput("Average daily increase: ")
number_day = getUserInputInt("Number of days to multiply: ")

print("\n---Table of data---\n")
print("Day Approximate\t\tPopulation")
for current_day in range(1, number_day + 1):
    print(f"{current_day}\t\t\t{number_organisms:.3f}")
    number_organisms *= (1 + percentage)
