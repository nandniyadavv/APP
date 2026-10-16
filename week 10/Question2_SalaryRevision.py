from functools import reduce

# Monthly salaries of employees
salaries = [35000, 42000, 28000, 50000, 39000, 60000]

# b) Identify employees eligible for the 10% increment
eligible_salaries = list(filter(lambda salary: salary < 40000, salaries))
print("Salaries eligible for increment:", eligible_salaries)

# a) Revise each salary using map() and lambda.
# Only salaries below 40000 receive a 10% increment.
revised_salaries = list(
    map(lambda salary: salary * 1.10 if salary < 40000 else salary, salaries)
)
print("Salaries after revision:", [round(salary, 2) for salary in revised_salaries])

# c) Calculate the total salary expenditure after revision
total_expenditure = reduce(lambda total, salary: total + salary, revised_salaries, 0)
print("Total salary expenditure after revision: ₹", round(total_expenditure, 2))

# d) Functional programming processes the salary list with clear,
# reusable operations and does not need to modify the original list.
