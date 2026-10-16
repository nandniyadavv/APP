python_pass(arun).
data_structures_pass(arun).

python_pass(bala).
data_structures_fail(bala).

python_pass(charan).
data_structures_pass(charan).

python_fail(divya).
data_structures_pass(divya).

course_eligible(Student) :-
    python_pass(Student),
    data_structures_pass(Student).

