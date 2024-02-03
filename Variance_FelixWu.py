#Felix Wu
#ICS206
'''This is a program that gives the user a sorted list of the numbers that they input,
calculate the average of those numbers, and give the variance'''
#Ask the user for a number of inputs, and let them input numbers
def populates():
    my_list = []
    numbers = int(input("Enter how many numbers you want to input, then input that amount of numbers : "))
    if numbers < 2:
        print ('That is not a valid amount')
        numbers = int(input("Enter how many numbers you want to input, then input that amount of numbers : "))
    for i in range(0, numbers):
        num = int(input())
        my_list.append(num)
    return my_list

#Sort those numbers 
def sorter(sorting):
    sorting.sort()
    print(sorting)
    len(sorting)
    return sorting

#Find the average and variance of those numbers
def stats(s):
    average = sum(s) / len(s)
    print("The average of your numbers are",average)
    for i in range (len(s)):
        s[i] = average - s[1]
    for i in range(len(s)):
        s[i] = s[i] ** 2
    total = sum(s)
    variance = total / len(s)
    print("The variance of your numbers is",round(variance,2))
    return s

#Display those numbers in a sorted order
def display(d):
    print("Sorted list in order:",d)
    print()
list_ce = populates()
sort_ce = sorter(list_ce)
display(sort_ce)
stats(sort_ce)
