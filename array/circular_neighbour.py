
n = int(input("Enter the number of elements: "))
a = list(map(int, input("Enter the elements: ").split()))

for i in range(n):
    left = (i - 1 + n) % n
    right = (i + 1) % n

    count = 0

    if a[left] > a[i]:
        count += 1

    if a[right] > a[i]:
        count += 1

    print(count, end=" ")

print()
