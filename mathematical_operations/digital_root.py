
n = int(input("Enter a number: "))

while n >= 10:
    total = 0

    while n > 0:
        digit = n % 10
        total += digit
        n //= 10

    n = total

print(n)

"""
n = int(input())

if n == 0:
    print(0)
else:
    print(1 + (n - 1) % 9)

formaula: digital root = 1 + (n - 1) % 9
"""