
n = int(input())
a = list(map(int, input().split()))

total_sum = sum(a)

prefix_sum = 0
count = 0

for i in range(n - 1):
    prefix_sum += a[i]

    suffix_sum = total_sum - prefix_sum
    difference = abs(prefix_sum - suffix_sum)

    if difference % 2 == 0:
        count += 1

print(count)
5