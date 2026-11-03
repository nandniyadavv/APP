from automata.fa.nfa import NFA

nfa = NFA(
    states={"q0", "q1", "q2"},
    input_symbols={"a", "b"},
    transitions={
        "q0": {"a": {"q0", "q1"}, "b": {"q0"}},
        "q1": {"a": set(), "b": {"q2"}},
        "q2": {"a": {"q2"}, "b": {"q2"}}
    },
    initial_state="q0",
    final_states={"q2"}
)

test_strings = ["ab", "aab", "baba", "ba", "aa", "abb", ""]

for value in test_strings:
    if nfa.accepts_input(value):
        print(value, "Accepted")
    else:
        print(value, "Rejected")
