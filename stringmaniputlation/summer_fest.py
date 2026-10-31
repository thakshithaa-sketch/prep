
n = int(input("Enter the number of people: "))
p = int(input("Enter the cost per bus: "))
q = int(input("Enter the cost per shuttle: "))

minimum_cost = float('inf')

for buses in range((n + 79) // 80 + 1):

    remaining = max(0, n - buses * 80)

    shuttles = (remaining + 7) // 8

    cost = (buses * p + shuttles * q) * 75

    minimum_cost = min(minimum_cost, cost)

print(minimum_cost)



""" Transport N people using buses (capacity 80) and shuttles (capacity 8). Find the minimum fuel cost.
- Bus fuel consumption = P litres
- Shuttle fuel consumption = Q litres
- Fuel price = 75 coins/litre """