pip3 install memory-profiler

a = [[1, 10],
    [3, 4]]
b = [[5, 6],
    [7, 8]]
c = [[0 for x in range(2)] for y in range(2)] 
for i in range(2):
    for j in range(2):
        c[i][j]=0
        for k in range(2):
            c[i][j]=c[i][j]+a[i][k]*b[k][j]
print(c)

     
