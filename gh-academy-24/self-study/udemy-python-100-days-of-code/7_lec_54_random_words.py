import random 

word_list = ["aardvark", "baboon", "camel"]

#todo 1: randomly choose a word from the word_list and assign it to the variable chosen_word. then print it
chosen_word = random.choice(word_list)
print(chosen_word)

#todo2: ask the user to guess a letter and assign it to a variable called guess. make guess lowercase
guess = input("Guess a letter: ").lower()

#todo3: check if guess is one of the letters in the chosen_word. Print "Right" / "Wrong"

for char in chosen_word:
    if guess == char:
        print("Right")
    else: 
        print("Wrong")