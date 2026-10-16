from functools import reduce

marks = [45, 67, 32, 89, 50, 96, 100]

passed_marks = list(filter(lambda mark: mark >= 50, marks))
print("Students scoring 50 or above:", passed_marks)

grace_marks = list(map(lambda mark: min(mark + 5, 100), marks))
print("Marks after grace marks:", grace_marks)

total_marks = reduce(lambda total, mark: total + mark, grace_marks, 0)
print("Total marks after grace marks:", total_marks)

