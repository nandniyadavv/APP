import socket

HOST = "127.0.0.1"
PORT = 5001

server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server.bind((HOST, PORT))
print("Temperature monitoring server is running...")

while True:
    data, address = server.recvfrom(1024)
    temperature = data.decode()
    print("Temperature received:", temperature, "from", address)
