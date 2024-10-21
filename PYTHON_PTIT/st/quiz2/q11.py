import tkinter as tk
from tkinter import messagebox

def convert():
    try:
        cups = float(entry.get())
        if cups < 0:
            messagebox.showerror("Error Message", "Enter valid input")
            return
        
        messagebox.showinfo("Results", f"{cups:.1f} cups is equal to {cups*8:.1f} ounces.")

    except ValueError:
        messagebox.showerror("Error Message", "Enter valid input")
        

root = tk.Tk()
root.geometry("350x175")
root.title("Cups to Ounces converter")

input_frame = tk.Frame(root, bg='#F1EFF1')
input_frame.pack(fill=tk.BOTH, expand=False, pady=(0, 0))

label = tk.Label(input_frame, text="Number of cups:")
label.grid(row=0, column=0, padx=(90, 5), pady=(10, 0))

entry = tk.Entry(input_frame, bg='lightblue', width=15)
entry.grid(row=0, column=1, padx=5, pady=(10, 0))

button_frame = tk.Frame(input_frame)
button_frame.grid(row=1, column=0, columnspan=2, pady=(10, 0))

calculate_button = tk.Button(button_frame, text="Convert", command=convert)
calculate_button.pack(side=tk.LEFT, padx=(80, 0))

quit_button = tk.Button(button_frame, text="Quit", command=root.quit)
quit_button.pack(side=tk.LEFT)

root.mainloop()