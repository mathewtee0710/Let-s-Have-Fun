even_sum = 0

for number in range(10):
    score = int(input("Enter a score: "))
    if score % 2 == 0:
        even_sum = even_sum + score

print("The sum of even numbers is:", even_sum)

