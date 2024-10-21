import random
import math

public_key = None
private_key = None
n = None

def setkeys():
    global public_key, private_key, n
    prime1 = 19
    prime2 = 37

    n = prime1 * prime2
    fi = (prime1 - 1) * (prime2 - 1)

    e = 2
    while True:
        if math.gcd(e, fi) == 1:
            break
        e += 1

    public_key = e

    d = 2
    while True:
        if (d * e) % fi == 1:
            break
        d += 1

    private_key = d


def encrypt(message):
    global public_key, n
    e = public_key
    encrypted_text = 1
    while e > 0:
        encrypted_text *= message
        encrypted_text %= n
        e -= 1
    return encrypted_text

def encoder(message):
    encoded = []
    for letter in message:
        encoded.append(encrypt(ord(letter)))
    return encoded

if __name__ == '__main__':
    setkeys()
    message = "IlovePhenikaa"
    coded = encoder(message)

    with open("rsa-encrypt.dat", "w") as file_out:
        file_out.write(' '.join(str(p) for p in coded))

    