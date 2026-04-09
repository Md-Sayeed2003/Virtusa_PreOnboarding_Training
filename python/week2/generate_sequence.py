def generate_sequence(n):
    seq = [n]
    
    while n != 1 and len(seq) < n:
        if n % 2 == 0:
            n = n // 2
        else:
            n = 3 * n + 1
        seq.append(n)
        
    return seq

n = int(input())

seq = generate_sequence(n)
print(seq)