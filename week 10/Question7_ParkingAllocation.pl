% Question 7: Rule-based parking allocation
% parking_slot(Slot, VehicleType, Availability).

parking_slot(s1, car, available).
parking_slot(s2, bike, occupied).
parking_slot(s3, car, available).
parking_slot(s4, bike, available).
parking_slot(s5, car, occupied).

% Rule: find available parking slots for a given vehicle type.
available_slot(VehicleType, Slot) :-
    parking_slot(Slot, VehicleType, available).

% Query for available car parking slots:
% ?- available_slot(car, Slot).
% Expected answers: Slot = s1 ; Slot = s3.
