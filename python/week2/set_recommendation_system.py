
def recommendation(userA,userB):
    set_a = set(userA)
    set_b = set(userB)
    
    common_items = set_a & set_b
    unique_items = set_a ^ set_b
    
    # recommendation for A
    recommendation_a = set_b - set_a
    
    # recommendation for B
    recommendation_b = set_a - set_b
    
    return common_items ,unique_items, recommendation_a , recommendation_b


userA = ["python","java","sql","gcp","react"]
userB = ["python","flask","react","aws" ,"go","sql"]

common_items,unique_items , recommendation_a , recommendation_b = recommendation(userA,userB)

print("User A likes    ",set(userA))
print("User B likes    ",set(userB))

print("Common : ",common_items)
print("Unique : ",unique_items)
print("Recommendation for A : ",recommendation_a)
print("Recommendation for B : ",recommendation_b)