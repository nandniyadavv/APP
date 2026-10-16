% Question 5: Eligibility for the advanced programming course
% Facts: students who passed each prerequisite subject.

python_pass(arun).
data_structures_pass(arun).

python_pass(bala).
data_structures_fail(bala).

python_pass(charan).
data_structures_pass(charan).

python_fail(divya).
data_structures_pass(divya).

% Rule: a student is eligible only if both subjects are passed.
course_eligible(Student) :-
    python_pass(Student),
    data_structures_pass(Student).

% Query to retrieve eligible students:
% ?- course_eligible(Student).
% Expected answers: Student = arun ; Student = charan.
