def fahrenheit_conversion(celsius):
    threshold_value = 120
    fahrenheit = (celsius * 9/5) + 32
    if fahrenheit < threshold_value:
        print("Cold advisory")
    else:
        print("Heat alert")
    print(celsius, "degrees celsius to fahrenheit is: " , fahrenheit)  
