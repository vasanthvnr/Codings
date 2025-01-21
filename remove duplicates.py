#remove duplicate without using functions

def remdup(str):
    str1=[]
    for i in str:
        if i not in str1:
            str1.append(i)
    res=" "
    #to check using membership operator
    for i in str1:
        res+=i
    return res
#convert list to string

n="vasanth"
print(remdup(n))
