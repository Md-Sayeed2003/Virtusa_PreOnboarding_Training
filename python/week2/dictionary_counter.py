import string

def word_frequency(paragraph,k):
    
    cleaned = paragraph.lower().translate(str.maketrans("","",string.punctuation))
    
    words = cleaned.split()
    freq = {}
    for word in words:
        freq[word] = freq.get(word,0)+1
        
        
    top_k = sorted(freq.items(),key=lambda x : x[1],reverse=True)[:k]
    
    return freq , top_k


paragraph = "Python is great. Python is easy to learn. Learning Python is fun! Everyone loves Python."
k = 3

freq, top_k = word_frequency(paragraph, k)

print("Word Frequencies:", freq)
print(f"\nTop {k} Words:")
for word, count in top_k:
    print(f"  {word} -> {count} times")
