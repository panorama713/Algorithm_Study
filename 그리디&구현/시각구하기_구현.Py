# 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 
# 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하시오

# 정수 n이 입력됨
h = int(input())
count = 0

# 0시 0분 0초부터 입력된 시간까지 초단위로 돌림
for k in range(h + 1):
    for j in range(60):
        for i in range(60):
            # 매 시각 안에 '3' 이 포함되어 있다면 카운트 증가
            if '3' in str(i) + str(j) + str(k):
                count += 1
print(count)


