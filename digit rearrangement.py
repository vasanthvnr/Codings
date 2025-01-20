def digit(n1,n2):
    if len(n1)!= len(n2):
        return False
    count=0
    l=len(n1)
    for i in n1:
        if i in n2:
            count+=1
    if count==l:
        return True

num1="123"
num2="3241"
print(digit(num1,num2))
