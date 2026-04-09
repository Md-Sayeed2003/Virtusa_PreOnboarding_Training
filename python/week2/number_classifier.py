
def classify_number(n):
    if n % 3 == 0 and n % 5 == 0:
        return "FizzBuzz"
    elif n % 3 == 0:
        return "Fizz"
    elif n % 5 == 0:
        return "Buzz"
    else:
        
        if n <= 1:
            return "Composite"
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:
                return "Composite"
        return "Prime"
    

n = int(input())
ans = classify_number(n)
print(ans)


