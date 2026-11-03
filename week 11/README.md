# Tutorial 11

Solutions for Tutorial 11 (03-11-2026).

## Programs

- `Question1_TCP_Server.py` and `Question1_TCP_Client.py`: TCP-based student result request. Start the server first, then run the client in another Terminal window.
- `Question2_UDP_Server.py` and `Question2_UDP_Client.py`: UDP-based temperature transmission. Start the server first, then run the client in another Terminal window.
- `Question3_SymPyExpressions.py`: symbolic expansion, factorization, simplification, and quadratic equation solving.
- `Question4_VehicleMotion.py`: symbolic velocity, acceleration, times when the vehicle is at rest, and definite integration over a user-entered interval.
- `Question5_DFA_BinaryCode.py`: DFA for binary strings ending in `01`.
- `Question6_NFA_SubstringAB.py`: NFA for strings containing the substring `ab`.

## Install required libraries

```bash
python3 -m pip install sympy automata-lib
```

The TCP and UDP programs use Python's built-in `socket` library.

Run each server before its matching client. For the TCP and UDP examples, both programs are configured to run on the same computer using `127.0.0.1`.
