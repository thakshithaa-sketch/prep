
n = int(input("Enter n: "))
r = int(input("Enter r: "))

numerator = 1
for i in range(1, n + 1):
    numerator *= i

denominator = 1
for i in range(1, n - r + 1):
    denominator *= i

print("Permutation =", numerator // denominator)


""" Calculate permutation of n objects taken r at a time 
formula: nPr = n! / (n - r)!
"""
