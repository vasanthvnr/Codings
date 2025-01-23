#prime number

def prime_num(n):
    for i in range(2, int(n**0.5)+1):#to find the square root of the given number 
        if n%i==0:
            return False
    return True

num=int(input("Enter the number:"))
prime=prime_num(num)
if prime_num(num):
    print("The number", num, "is prime")
else:
    print("The number", num, "is not prime")
