total = 0

for number in range(10):
  score = float(input(f"Enter score {number + 1}: "))
  total += score

print(f"The sum of the 10 scores is: {total}")

