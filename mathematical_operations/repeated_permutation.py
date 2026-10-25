
s = input("Enter a string: ")

n = len(s)

# Calculate n!
numerator = 1
for i in range(1, n + 1):
    numerator *= i

# Count the frequency of each character
freq = {}

for ch in s:
    if ch in freq:
        freq[ch] += 1
    else:
        freq[ch] = 1

# Calculate the product of frequency factorials
denominator = 1

for count in freq.values():
    fact = 1
    for i in range(1, count + 1):
        fact *= i
    denominator *= fact

# Calculate repeated permutation
result = numerator // denominator

print("Repeated permutation =", result)


""" formula: n! / (n1! * n2! * ... * nk!) where n is the total number of items and n1, n2, ..., nk are the frequencies of the distinct items."""


'''

from collections import Counter

s = input("Enter a string: ")

n = len(s)

# Calculate n!
numerator = 1
for i in range(1, n + 1):
    numerator *= i

# Calculate the product of frequency factorials
denominator = 1
freq = Counter(s)

for count in freq.values():
    fact = 1
    for i in range(1, count + 1):
        fact *= i
    denominator *= fact

print("Repeated permutation =", numerator // denominator)

'''