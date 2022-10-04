# 나이트의 좌표 값 입력
input_data = input()

# 영어를 숫자 1~9로 변환
# ord : 해당 문자를 유니코드 정수로 변환
x = int(ord(input_data[0]) - int(ord('a')) + 1)

y = int(input_data[1])

count = 0

# 나이트가 체스판 에서 이동할 수 있는 경로(8가지)
# 오른쪽 2 위 1
nx = x + 2
ny = y - 1

if nx and ny > 0 and nx and ny < 9:
    count += 1
    print('nx')

# 오른쪽 2 아래 1
n2x = x + 2
n2y = y + 1

if n2x and n2y > 0 and n2x and n2y < 9:
    count += 1

# 왼쪽 2 위 1
n3x = x - 2
n3y = y - 1

if n3x and n3y > 0  and n3x and n3y < 9:
    count += 1

# 왼쪽 2 아래 1
n4x = x - 2
n4y = y - 1

if n4x and n4y > 0  and n4x and n4y < 9:
    count += 1

# 아래 2 오른쪽 1
n5x = x + 1
n5y = y + 2

if n5x and n5y > 0  and n5x and n5y < 9:
    count += 1

# 아래 2 왼쪽 1
n6x = x - 1
n6y = y + 2

if n6x and n6y > 0  and n6x and n6y < 9:
    count += 1

# 위 2 오른쪽 1
n7x = x + 1
n7y = y - 2

if n7x and n7y > 0 and n7x and n7y < 9:
    count += 1

# 위 2 왼쪽 1
n8x = x - 1
n8y = y - 2

if n8x and n8y > 0 and n8x and n8y < 9:
    count += 1

print(count)


# 나이트가 이동할 수 있는 8가지 방향 정의
steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

# 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
result = 0
for step in steps:
    # 이동하고자 하는 위치 확인
    next_y = y + step[0]
    next_x = x + step[1]

    # 해당 위치로 이동이 가능하다면 카운트 증가
    if next_y >= 1 and next_y <= 8 and next_x >= 1 and next_x <= 8:
        result += 1

print(result)