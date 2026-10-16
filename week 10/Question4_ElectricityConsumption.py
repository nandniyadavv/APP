from functools import reduce

consumption = [8, 12, 9, 15, 11, 7, 14]
RATE_PER_UNIT = 6

high_consumption_days = list(filter(lambda units: units > 10, consumption))
print("Consumption above 10 units:", high_consumption_days)

daily_costs = list(map(lambda units: units * RATE_PER_UNIT, consumption))
print("Daily electricity costs (₹):", daily_costs)

total_consumption = reduce(lambda total, units: total + units, consumption, 0)
print("Total electricity consumption:", total_consumption, "units")

def electricity_bill(units):
    return units * RATE_PER_UNIT

daily_bills = list(map(electricity_bill, consumption))
print("Bills for each day (₹):", daily_bills)
print("Original consumption data:", consumption)
