import socket

HOST = "127.0.0.1"
PORT = 5001

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

while True:
    temperature = input("Enter temperature reading (or q to quit): ")
    if temperature.lower() == "q":
        break
    client.sendto(temperature.encode(), (HOST, PORT))

client.close()
