def fibonacci(n):
    fib=[0,1]
    for i in range(2, n):
        fib.append(fib[i-1]+fib[i-2])
    return fib
print(fibonacci(5))


#fibonacci is to add the two preceding numbers to get the third number upto the given range. it starts from 0,1.
