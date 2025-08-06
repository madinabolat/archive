height = int(input("What is your height?"))

if height >120: 
    print("You can ride the rollercoaster")
    age = int(input("What is your age? "))
    if age < 12: 
        print("the price is $5")
    elif age<18: 
        print("the price is $7")
    else:
        print("the price is $12")
else: 
    print("You cant ride the rollercoaster")