def analyze_records(records):
    
    top_student = max(records, key=lambda x: x[1])

    total = sum(score for _, score in records)
    average = total / len(records)

    above_average = tuple(record for record in records if record[1] > average)

    return top_student[0], round(average, 2), above_average


students = [
    ("Alice",  85),
    ("Bob",    92),
    ("Charlie", 78),
    ("Diana",  95),
    ("Eve",    88),
    ("Frank",  60),
]

top, avg, above = analyze_records(students)

print("Top Student:      ", top)
print("Average Score:    ", avg)
print("Above Average Students:")
for name, score in above:
    print(f"   {name}: {score}")