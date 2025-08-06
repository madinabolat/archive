import random
person_choice = int(input("What do you choose? 0 for Rock, 1 for Paper, 2 for Scissors"))
print(f'You chose {person_choice}')
computer_choice = random.randint(0,2)
print(f'Computer chose {computer_choice}')
if person_choice == 0:
    if computer_choice == 0:
        print("Tie")
    elif computer_choice == 1:
        print("You lost")
    else:
        print("You won")
if person_choice == 1:
    if computer_choice == 0:
        print("You won")
    elif computer_choice == 1:
        print("Tie")
    else:
        print("You lost")
else: 
    if computer_choice == 0:
        print("You lost")
    elif computer_choice == 1:
        print("You won")
    else:
        print("Tie")