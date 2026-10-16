from functools import reduce

# Daily household electricity consumption in units
consumption = [8, 12, 9, 15, 11, 7, 14]
RATE_PER_UNIT = 6

# a) Identify days when consumption exceeded 10 units
high_consumption_days = list(filter(lambda units: units > 10, consumption))
print("Consumption above 10 units:", high_consumption_days)

# b) Calculate cost for each day at ₹6 per unit
daily_costs = list(map(lambda units: units * RATE_PER_UNIT, consumption))
print("Daily electricity costs (₹):", daily_costs)

# c) Determine total electricity consumption using reduce()
total_consumption = reduce(lambda total, units: total + units, consumption, 0)
print("Total electricity consumption:", total_consumption, "units")

# d) Pure function calculates a bill without modifying consumption data
def electricity_bill(units):
    return units * RATE_PER_UNIT

daily_bills = list(map(electricity_bill, consumption))
print("Bills for each day (₹):", daily_bills)
print("Original consumption data:", consumption)
