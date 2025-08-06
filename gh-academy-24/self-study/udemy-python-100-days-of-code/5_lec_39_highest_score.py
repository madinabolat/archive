numbers = [1, 2, 5, 10, 15, 3,1]

max = numbers[0]
for number in numbers: 
    if max < number:
        max = number

print(max)