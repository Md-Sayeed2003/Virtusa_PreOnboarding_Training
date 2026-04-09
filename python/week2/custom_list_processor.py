
def process_list(num):
    
    num = [n for n in num if n>=0]
    
    result = []
    
    for n in num:
        result.append(n)
        if n%2==0:
            result.append(0)
    
    result.sort(reverse=True)
    
    return result
    

nums = [3,-1,4,-2,6,7,2,-5,8]

res = process_list(nums)

print("Original List : ",nums)
print("Processed List : ",res)
