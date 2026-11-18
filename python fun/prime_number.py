scores = [0] * 10

for number in range(10):
    scores[number] = int(input("Enter score " + str(number + 1) + ": "))

print("Prime scores: ", end="")

for num in scores:
    is_prime = True
    if num <= 1:
        is_prime = False
    else:
        for number2 in range(2, num):
            if num % number2 == 0:
                is_prime = False
                break

    if is_prime:
        print(num, end=" ")
