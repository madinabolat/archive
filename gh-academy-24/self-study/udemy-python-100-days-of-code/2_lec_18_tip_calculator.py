print("welcome to the tip calculator!")
bill = float(input("What was the total bill? $"))
tip_perc = int(input("How much tip would you like to give? 10, 12 15 "))
number_people = int(input("How many people to split the bill?"))

bill_per_person = round((bill * (1 + tip_perc / 100)) / number_people, 2)

print(f"Each person should pay: ${bill_per_person}")