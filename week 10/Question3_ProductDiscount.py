# Product prices during a festival sale
prices = [500, 1200, 2500, 999, 1500, 800]

# a) Pure function: returns a discounted price without changing the input list
def discounted_price(price):
    if price > 1000:
        return price * 0.80  # 20% discount
    return price

# c) Identify products costing more than ₹1000
eligible_prices = list(filter(lambda price: price > 1000, prices))
print("Products costing more than ₹1000:", eligible_prices)

# b) Apply the pure function to every product price using map()
revised_prices = list(map(discounted_price, prices))
print("Prices after festival discount:", [round(price, 2) for price in revised_prices])

# d) The function only calculates and returns a new value.
# It does not update 'prices', so the original list remains unchanged.
print("Original prices:", prices)
