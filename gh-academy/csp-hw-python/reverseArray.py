myArray = [10, 20, 30, 40, 50]
reversedArray = [0, 0, 0, 0, 1]
n = len(myArray)
for i in range(0, n):
    reversedArray[i] = myArray[n-i-1]
print(reversedArray)