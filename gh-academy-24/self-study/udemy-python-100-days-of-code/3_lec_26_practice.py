print("Welcome to Python Pizza Deliveries")
size = input("What size? S, M or L")
pepperoni = input("Pepperony? Y or N")
extra_cheese = input("Extra cheese? Y or N")

bill = 0;
if size == "S":
    bill += 15
elif size == "M": 
    bill += 20
elif size =="L":
    bill += 25
else: 
    print("You typed the wrong format")

if pepperoni == "Y": 
    if size == "S":
        bill += 2
    else: 
        bill += 3

if extra_cheese == "Y":
    bill += 1

print(f'your bill is ${bill}.')

