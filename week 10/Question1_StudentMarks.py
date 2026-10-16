from functools import reduce

# Marks obtained by students in the programming examination
marks = [45, 67, 32, 89, 50, 96, 100]

# a) filter(): select students who scored 50 or above
passed_marks = list(filter(lambda mark: mark >= 50, marks))
print("Students scoring 50 or above:", passed_marks)

# b) map(): award 5 grace marks, without exceeding 100
grace_marks = list(map(lambda mark: min(mark + 5, 100), marks))
print("Marks after grace marks:", grace_marks)

# c) reduce(): calculate the total after grace marks
total_marks = reduce(lambda total, mark: total + mark, grace_marks, 0)
print("Total marks after grace marks:", total_marks)

# d) A lambda is a short anonymous function. It is useful with
# filter(), map(), and reduce() when the operation is simple.
