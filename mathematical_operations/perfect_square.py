
n = int(input("Enter a number: "))

if n < 0:
    print(False)
elif n < 2:
    print(True)
else:
    left = 1
    right = n

    while left <= right:
        mid = (left + right) // 2
        square = mid * mid

        if square == n:
            print(True)
            break
        elif square < n:
            left = mid + 1
        else:
            right = mid - 1
    else:
        print(False)
