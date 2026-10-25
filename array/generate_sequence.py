
n = int(input("Enter the number of elements: "))
initial = list(map(int, input("Enter the initial elements: ").split()))

a = initial[:n]

#After reading the input, a holds the entire sequence
#a is a standard variable name used to store a list of numbers
for i in range(6, n):
    a.append(a[i - 1] + a[i - 2])

print(*a)

""" When you write print(*a), 
it takes all the individual elements 
inside the list a and unpacks them 
so they are passed to the print() 
function as separate argumentsrather 
than as a single list object. """
