import sympy as sp

x = sp.symbols("x")

expression = (x + 2) ** 2
print("Expanded expression:", sp.expand(expression))

polynomial = x ** 2 + 5 * x + 6
print("Factorized expression:", sp.factor(polynomial))

complex_expression = (x ** 2 - 1) / (x - 1)
print("Simplified expression:", sp.simplify(complex_expression))

equation = sp.Eq(x ** 2 - 5 * x + 6, 0)
solutions = sp.solve(equation, x)
print("Quadratic equation solutions:", solutions)
