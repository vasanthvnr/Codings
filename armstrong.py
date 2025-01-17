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

#In the above we have to solve the armstrong of the number and say the number will be armstrong or not

#to declare the variables
#rmstrong concept is to split the digits in a integer power to the length of the string and sum these to get as same as the input integer is called as armstrong number
