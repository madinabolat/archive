def turn_right():
    turn_left()
    turn_left()
    turn_left()
def half_square():
    move()
    turn_left()
    move()
    turn_right()
    move()
    turn_right()
    move()
    turn_left()

for step in range(1,7):
    half_square()
