import socket

HOST = "127.0.0.1"
PORT = 5000

results = {
    "101": "Register No: 101, Name: Arun, Marks: 85, Result: Pass",
    "102": "Register No: 102, Name: Bala, Marks: 42, Result: Fail",
    "103": "Register No: 103, Name: Charan, Marks: 91, Result: Pass"
}

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((HOST, PORT))
server.listen(1)
print("Result server is running...")

while True:
    connection, address = server.accept()
    with connection:
        register_number = connection.recv(1024).decode().strip()
        result = results.get(register_number, "Register number not found")
        connection.sendall(result.encode())
        print("Request from", address, "for register number", register_number)
