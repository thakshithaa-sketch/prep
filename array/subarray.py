
n = int(input("Enter the number of elements: "))
a = list(map(int, input("Enter the elements: ").split()))

count = 0

for i in range(n - 2):
    if a[i] + a[i + 2] == a[i + 1]:
        count += 1

print(count)
