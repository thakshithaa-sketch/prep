""" Problem 3: String Transformation
Problem: Given two uppercase strings S1 and S2, find the minimum cost to transform S1 into S2.

Operations:
- Remove a character: Cost 0
- Swap two characters: Cost 0
- Add a character: Cost 1
Key observation: Since removing and swapping are free, we only need
 to count how many additional occurrences of each character are required
 """
s1 = input("Enter the first string: ")
s2 = input("Enter the second string: ")

freq1 = [0] * 26  
freq2 = [0] * 26

for ch in s1:
    freq1[ord(ch) - ord('A')] += 1

for ch in s2:
    freq2[ord(ch) - ord('A')] += 1

cost = 0

for i in range(26):
    if freq2[i] > freq1[i]:
        cost += freq2[i] - freq1[i]

print(cost)
