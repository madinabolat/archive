myArray = [10, 20, 30, 20, 10]
counter = 0
n = len(myArray)
for i in range(0, n):
    if myArray[i] != myArray[n - 1 - i]:
        counter+=1

if counter > 0:
    print("Not palindromic")
else:
    print("Palindromic")