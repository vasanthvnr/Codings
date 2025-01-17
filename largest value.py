def large(n):
    largest=0
    for i in n:
        if i>largest:
            second, largest=largest, i
        elif i>second and n!=largest:
            second =i
    return second
print(large([1,3,5,2,0]))
