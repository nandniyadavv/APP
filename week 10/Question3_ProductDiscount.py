prices = [500, 1200, 2500, 999, 1500, 800]

def discounted_price(price):
    if price > 1000:
        return price * 0.80
    return price

eligible_prices = list(filter(lambda price: price > 1000, prices))
print("Products costing more than ₹1000:", eligible_prices)

revised_prices = list(map(discounted_price, prices))
print("Prices after festival discount:", [round(price, 2) for price in revised_prices])

print("Original prices:", prices)
