import sympy as sp

t = sp.symbols("t")
s = t ** 3 - 6 * t ** 2 + 9 * t + 5

velocity = sp.diff(s, t)
acceleration = sp.diff(velocity, t)

print("Displacement:", s)
print("Velocity:", velocity)
print("Acceleration:", acceleration)

rest_times = sp.solve(velocity, t)
print("Vehicle is momentarily at rest at:", rest_times)

start = float(input("Enter start time for displacement: "))
end = float(input("Enter end time for displacement: "))
displacement = sp.integrate(s, (t, start, end))
print("Displacement integral over interval:", displacement)
