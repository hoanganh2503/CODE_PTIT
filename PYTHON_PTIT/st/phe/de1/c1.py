def vigenere_encrypt(plain_text, key):
    encrypted = []
    key_len = len(key)
    key_pos = 0

    for char in plain_text:
        if char.isalpha():
            shift = ord(key[key_pos % key_len]) - ord('a')
            encrypted_char = chr((ord(char) - ord('a') + shift) % 26 + ord('a'))
            encrypted.append(encrypted_char)
            key_pos += 1
        else:
            encrypted.append(char)

    return ''.join(encrypted)

email = 'son.doantrung@phenikaa-uni.edu.vn'
key = "bgpa"  # Khóa K=(2,7,15,27) chuyển sang ký tự

encrypted_email = vigenere_encrypt(email, key)

print("Địa chỉ email đã được mã hóa: ", encrypted_email)