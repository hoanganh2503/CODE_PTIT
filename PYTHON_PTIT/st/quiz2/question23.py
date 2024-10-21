import tkinter as tk
from tkinter import messagebox

def calculate_discount():
    try:
        packages_purchased = int(entry.get())
        if packages_purchased <= 0:
            messagebox.showerror("Input Error", "Number of packages cannot be negative.")
            return
        if packages_purchased < 10:
            discounts = 0
        elif 10 <= packages_purchased < 20:
            discounts = 0.1
        elif 20 <= packages_purchased < 50:
            discounts = 0.2
        elif 50 <= packages_purchased < 100:
            discounts = 0.3
        elif packages_purchased >= 100:
            discounts = 0.4
        packages_purchased *= 99
        result_text.set(f"Discount Amount: ${(discounts*packages_purchased):.2f}\nTotal Amount after Discount: ${(packages_purchased-discounts*packages_purchased):.2f}")
    except ValueError:
        messagebox.showerror("Input Error", "Please enter a valid number.")

root = tk.Tk()
root.geometry("600x275")
root.title("Software discount calculator")

input_frame = tk.Frame(root, bg='#F1EFF1')
input_frame.pack(fill=tk.BOTH, expand=False, pady=(0, 0))

label = tk.Label(input_frame, text="Enter the number of packages purchased:")
label.grid(row=0, column=0, padx=(120, 5), pady=(10, 0))

entry = tk.Entry(input_frame)
entry.grid(row=0, column=1, padx=5, pady=(10, 0))

button_frame = tk.Frame(input_frame)
button_frame.grid(row=1, column=0, columnspan=2, pady=(10, 0))

calculate_button = tk.Button(button_frame, text="Calculate Discount", command=calculate_discount)
calculate_button.pack(side=tk.LEFT, padx=(140, 0))  # Add padding to the right

quit_button = tk.Button(button_frame, text="Quit", command=root.quit)
quit_button.pack(side=tk.LEFT)

result_frame = tk.Frame(root, bg='lightblue')
result_frame.pack(fill=tk.BOTH, side=tk.LEFT, expand=True)

result_text = tk.StringVar()
result_display = tk.Label(
    result_frame,
    textvariable=result_text,
    font=("Helvetica", 12),
    bg="lightblue",
    anchor='w',    
    justify='left' 
)
result_display.pack(anchor='nw', padx=10, pady=(10, 0))

root.mainloop()