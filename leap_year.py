def year(n):
    if n%4==0 and n%100!=0 or n%400==0:
        return True
    else:
        return False
print(year(2000))


#leap year to find the year would be leap year or not

# to modulus the year by 4 and 100 or 400 to get the result as 0 is a leap year otherwise not a leapyear
