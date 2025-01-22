# compare two floats

def compare(n1,n2):
    n1=int(n1*1000)
    n2 = int(n2*1000)
    if n1==n2:
        return True
    return False

flt1=float(input("Enter the float 1 value:"))
flt2=float(input("Enter the float 2 value:"))

print("The comparison is ", compare(flt1,flt2))
