def analyze_nested_list(nested_list):
    sums = []
    all_values = []

    for sublist in nested_list:
        sums.append(sum(sublist))
        all_values.extend(sublist)

    max_value = max(all_values)
    flattened_unique = list(dict.fromkeys(all_values))  

    return sums, max_value, flattened_unique


nested = [[1, 2, 3], [4, 5, 5], [6, 1, 2]]

sums, max_val, flat_unique = analyze_nested_list(nested)

print("Sublist Sums:         ", sums)
print("Maximum Value:        ", max_val)
print("Flattened (no dupes): ", flat_unique)