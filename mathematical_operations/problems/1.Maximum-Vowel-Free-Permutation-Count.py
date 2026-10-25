
def factorial(n):
    fact = 1

    for i in range(1, n + 1):
        fact *= i

    return fact


def maximum_permutation(arr, n):
    vowels = "aeiouAEIOU"
    maximum = 0

    for word in arr:
        count = 0

        for ch in word:
            if ch not in vowels:
                count += 1

        if count > 0:
            permutations = factorial(count)

            if permutations > maximum:
                maximum = permutations

    return maximum


n = int(input())
arr = []

for i in range(n):
    arr.append(input())

print(maximum_permutation(arr, n))
