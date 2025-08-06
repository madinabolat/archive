print('''
                _
               (_)
                |
           ()---|---()
                |
                |
         __     |     __
        |\     /^\     /|
         '..-'   '-..'
            `-._ _.-`
                `

''')

print("Welcome to the Treasure Island.")
print("Your mission is to find the treasure.")

left_right = input("left or right?").lower()
print(left_right)

if left_right == "left":
    swim_wait = input("swim or wait").lower()
    if swim_wait == "wait":
        which_door = input("which door?").lower()
        if which_door == "red":
            print("Burned by fire. Game Over.")
        elif which_door == "blue":
            print("Eaten by beasts. Game Over.")
        elif which_door == "yellow":
            print("You Win!")
        else:
            print("Game Over.")
    else: 
        print("Attacked by trout. Game Over.")
else:
    print("Fall into a hole. Game Over.")



