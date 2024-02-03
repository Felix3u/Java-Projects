#ICS2O1
#FelixWu 
'''This is a program that will take a value under 1, and convert it into the appropriate
amount of change'''
#Create a set of functions to define the change amounts
def quarters(q):
    remainder = (q % 25)
    return remainder
def dimes(d):
    remainder = (d % 10)
    return remainder
def nickels(n):
    remainder = (n % 5)
    return remainder


#Create an area where the user can enter a value
money = float(input('Enter amount of money in cents, less than 1 dollar, enter -1 to end program: '))
while money != -1:
    if money > 1: #This if statement will happen if the user inputs a value over 1
        print('That is not a value under 1 dollar, please try again')
        money = float(input('Enter amount of money in cents, less than 1 dollar, enter -1 to end program: '))
        
    #Equations to define the change
    moneyQuarter = money // 0.25 
    money = quarters (money)
    moneyDime = money // 0.1
    money = dimes (money)
    moneyNickel = money // 0.05  
    money = nickels (money)
    moneyPenny = money // 1
    
    #Print the amount of change
    print('')
    print('Quarters =', moneyQuarter)
    print('Dimes =', moneyDime)
    print('Nickels =', moneyNickel)
    print('Pennies =', moneyPennies)
    print('')
    money = float(input('Enter amount of money in cents, less than 1 dollar, enter -1 to end program: '))
