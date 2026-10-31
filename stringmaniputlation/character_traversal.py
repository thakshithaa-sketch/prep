
s = input("Enter a string: ")

result = []

for i in range(len(s)):
    ch = s[i]

    first_index = s.index(ch)

    repeat = first_index + 1

    group = ch * repeat

    result.append(group)
#print("the result is:", result)
print("-".join(result))
print("The length of the string is:", len(s))
