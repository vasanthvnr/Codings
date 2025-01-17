def year(n):
    if n%4==0 and n%100!=0 or n%400==0:
        return True
    else:
        return False
print(year(2000))
