height = int(input("What is your height?"))

if height >120: 
    print("You can ride the rollercoaster")
    bill = 0
    age = int(input("What is your age? "))
    if age < 12: 
        bill = 5
        print(f'the price is ${bill}')
    elif age<18: 
        bill = 7
        print(f'the price is ${bill}')
    elif age <= 55 and age >= 45:
        bill = 0
        print(f'the price is ${bill}')
    else:
        bill = 12
        print(f'the price is ${bill}')
else: 
    print("You cant ride the rollercoaster")