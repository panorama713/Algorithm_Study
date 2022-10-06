n = int(input())

count = 0
while True:
    if n == 0:
        break
    # 5로 나눠지는 경우
    if n % 5 == 0:
        count += (n % 5)
        n = n % 5
    elif n % 5 == 1:
        if n < 6:
            pass
        else:
            count += n % 5 - 1
            n = (n % 5) + 5
    elif n % 5 == 2:
        if n > 10:
            count += n % 5 - 2
            n = n % 5 + 10
        else:
            count = -1
            break
    elif n % 5 == 3:
        count += n % 5
        n = n % 5
    elif n % 5 == 4:
        count += n % 5 - 1
        n = n % 5 + 5
    # 3으로 나눠지는 경우    
    if n % 3 == 0:
        count += n % 3
    elif n % 3 == 1:
        if n < 10:
            count = -1
            break
        else:
            count += n % 3 - 3
            n = n % 3 + 9
    elif n % 3 == 2:
        count += n % 3 - 1
        n = n % 3 + 3

print(count)