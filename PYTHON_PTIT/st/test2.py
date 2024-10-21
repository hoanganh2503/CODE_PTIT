import os
from cryptography.fernet import Fernet
from tkinter import messagebox
import os
import base64

list_file = os.walk("D://test")
def decrypt_file(file_path, key):
    with open(file_path, 'rb') as file:
        cyphertext = file.read()
    decode = Fernet(key)
    _data = decode.decrypt(cyphertext)
    with open(file_path.replace('.enc', ''), 'wb') as fp:
        fp.write(_data)
    os.remove(file_path)

def handle_key(key):
    # try:
        for root, _, files in list_file:
            for file_name in files:
                if file_name.endswith('.enc'):
                    file_path = os.path.join(root, file_name)
                    decrypt_file(file_path, key)
        messagebox.showinfo("info", f"Đừng để bị hack nữa nhé!") 
    # except:
    #     messagebox.showerror("Error", f"Key sai")

ciphertext_str = 'k9CD_JLX9t_q5DbDsRhEy47jJbRoAB_ApKQzj7dLU8k='

# Loại bỏ ký tự không mong muốn khỏi chuỗi base64
cleaned_ciphertext_str = ciphertext_str.replace('-', '+').replace('_', '/')

# Đảm bảo độ dài của chuỗi base64 là bội số của 4
while len(cleaned_ciphertext_str) % 4 != 0:
    cleaned_ciphertext_str += '='

# Chuyển chuỗi base64 đã làm sạch thành bytes và giải mã
ciphertext_bytes = base64.b64decode(cleaned_ciphertext_str)
handle_key(ciphertext_bytes)