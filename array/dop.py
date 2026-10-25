
n, L, R = map(int, input("Enter n, L, R: ").split())
a = list(map(int, input("ARRAY ").split()))

level = 0
max_level = 0
min_level = 0

for i in range(n):
    if L <= a[i] <= R:
        level += 1
    else:
        level -= 1

    if level > max_level:
        max_level = level

    if level < min_level:
        min_level = level

print(max_level, min_level)
