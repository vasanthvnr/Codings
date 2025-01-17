def armstrong(n):
    sum=0
    temp=n
    while n>0:
        a=n%10
        sum+= a**3
        n//=10
    return sum
n=int(input())
m=armstrong(n)
temp=n
if m==temp :
    print("armstrong")
else:
    print("Not armstrong")

