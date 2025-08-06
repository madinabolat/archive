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
    
   
num_of_hurdles = 6
while num_of_hurdles > 0 and (at_goal()!=True): 
    half_square()
    num_of_hurdles -=1