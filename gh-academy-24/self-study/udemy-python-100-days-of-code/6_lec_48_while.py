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
def turn_around():
    turn_left()
    move()
    turn_right()
    move()
    turn_right()
    move()
    turn_left()

while not at_goal():
    if (wall_in_front() is True):
        turn_around()
    else:
        move()