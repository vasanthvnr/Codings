def peaknum(arr):
    n= len(arr)
    for i in range(n):
        if (i==0 or arr[i]>arr[i-1]) and (i==n-1 or arr[i]>arr[i+1]):
            return True
        else :
            return False
    


arr=[2,4,5,7,8,9]
print(peaknum(arr))
