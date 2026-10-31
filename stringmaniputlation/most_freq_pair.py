
s = input("Enter a string of words: ")

words = s.split()

freq = {}

for word in words:
    pair = word[0] + word[-1]

    freq[pair] = freq.get(pair, 0) + 1

max_freq = max(freq.values())

result = []

for pair in freq:
    if freq[pair] == max_freq:
        result.append(pair)
#print(result)
print(" ".join(result))
print("The maximum frequency is:", max_freq)

"""Problem: Given a sentence, find the most frequently occurring letter pair.

A pair consists of:
- First letter of a word
- Last letter of the same word
If multiple pairs have the same maximum frequency, return them in their order of first appearance."""