from functools import reduce

salaries = [35000, 42000, 28000, 50000, 39000, 60000]

eligible_salaries = list(filter(lambda salary: salary < 40000, salaries))
print("Salaries eligible for increment:", eligible_salaries)

revised_salaries = list(
    map(lambda salary: salary * 1.10 if salary < 40000 else salary, salaries)
)
print("Salaries after revision:", [round(salary, 2) for salary in revised_salaries])

total_expenditure = reduce(lambda total, salary: total + salary, revised_salaries, 0)
print("Total salary expenditure after revision: ₹", round(total_expenditure, 2))

