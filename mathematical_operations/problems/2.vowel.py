
def vowel_permutation(s):
    vowels = "aeiouAEIOU"
    consonants = 0

    for ch in s:
        if ch not in vowels:
            consonants += 1

    if consonants == 0:
        return 0

    fact = 1
    for i in range(1, consonants + 1):
        fact *= i

    return fact


s = input()
print(vowel_permutation(s))
