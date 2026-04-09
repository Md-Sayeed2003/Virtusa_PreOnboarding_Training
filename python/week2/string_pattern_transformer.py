def transform_string(s):
    vowels = "aeiouAEIOU"

    s = [ch for ch in s if not ch.isdigit()]

    vowel_list = [ch for ch in s if ch in vowels]
    vowel_list.reverse()

    
    result = []
    vowel_index = 0
    for ch in s:
        if ch in vowels:
            result.append(vowel_list[vowel_index])  
            vowel_index += 1
        elif ch.isalpha():
            result.append(ch.upper())              
        else:
            result.append(ch)                      

    return "".join(result)


text = "hello world 123"

output = transform_string(text)

print("Original:    ", text)
print("Transformed: ", output)