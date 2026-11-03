import socket

HOST = "127.0.0.1"
PORT = 5000

register_number = input("Enter student register number: ")

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect((HOST, PORT))
client.sendall(register_number.encode())
result = client.recv(1024).decode()
print("Student result:", result)
client.close()
