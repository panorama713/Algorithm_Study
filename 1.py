# from re import I


# a = 1000
# print(a)

# a  =  a + 5
# print(a)

# b = 1e9
# print(b)
# # 정수표현을 위해 int 로 변환
# b = int(1e9)
# print(b)

# b = 75.25e1
# print(b)

# b = 3954e-3
# print(b)

# b = 123.456
# print(round(b,2))

# a = 7
# b = 3
# print(round(a / b,1))

# print('----리스트 자료형----')
# a = [1,2,3,4,5,6]
# print(a[3])

# a[4] = 4
# print(a)

# print(a[-1])

# print('리스트 컴프리헨션')
# a = [i for i in range(50)]
# print(a)

# # 0부터 19까지의 수 중에서 홀수만 포함하는 리스트
# a = [i for i in range(20) if i % 2 == 1]
# print(a)

# # 1부터 9까지의 수들의 제곱 값을 포함하는 리스트
# array = [i * i for i in range(1,10)]
# print(array)

# # 언더바 사용
# print('----코드 1:1부터 9까지의 자연수를 더하기----')
# # 코드 1
# summary = 0
# for i in range(1, 10):
#     summary += i
# print(summary)

# # 코드 2
# for _ in range(5):
#     # 변수값이 사용되지 않고 단순 반복이라 언더바 사용!!
#     print('hello world')
    


# a = [1,2,3,4,5,5]
# remove_set = {3,5} #집합 자료형

# print('---remove_list에 포함되지 않은 값만을 저장---')
# result = [i for i in a if i not in remove_set]
# print(result)

# print('---문자열 자료형---')
# a = 'hello'
# b = 'world'

# print(a + ' ' + b)
# print(a[1])


# # 튜플 사용 예제
# print('--튜플--')
# a = (1,2,3,4,5)
# print(a)
# print(a[1])

# #a[2] = 7 # 튜플은 원소 할당을 지원하지 않음 "변경 불가능"

# print('--사전 자료형--')
# data = dict()
# data['사과'] = 'apple'
# data['바나나'] = 'banana'
# data['코코넛'] = 'coconut'

# print(data)

# if '사과' in data:
# 	print("'사과'를 키로 가지는 데이터가 존재합니다.")

# b = {
#     '홍길동' : 97,
#     '이순신' : 98
# }
# print(list(b.keys()))
# print(b.values())

# print('--집합 자료형--')

# # 집합 자료형 초기화 방법 1
# data = set([1,1,2,3,4,4,5])
# print(data)

# # 집합 자료형 초기화 방법 2
# data = {1,1,2,3,4,4,5}
# print(data)


# # print('--표준 입출력--')
# # # 데이터의 개수 입력
# # n = int(input())
# # # 각 데이터를 공백을 기준으로 구분하여 입력
# # data = list(map(int, input().split()))

# # data.sort(reverse=True)
# # print(data)


# # 출력할 변수들
# a = 1
# b = 2
# print(a, b)
# print(7, end=" ")
# print(8, end=" ")

# # 출력할 변수
# answer = 7
# print("정답은 " + str(answer) + "입니다.")

# answer = 7
# print(f"정답은 {answer}입니다.")


# x = 15

# if x >= 10:
# 	print("x >= 10")

# if x >= 0:
# 	print("x >= 0")

# if x >= 30:
# 	print("x >= 30")


# score = 86

# if score >= 70:
# 	print('성적이 70점 이상입니다.')
# 	if score >= 90:
# 		print('우수한 성적입니다.')
# else:
# 	print('성적이 70점 미만입니다')
# 	print('조금 더 분발하세요')

# print('프로그램을 종료합니다.')


# a = 5

# if a >= 0:
#     print('a >= 0')
# elif a >= -10:
#     print('0 > a >= -10')
# else:
#     print('-10 > a')

# if True or False:
#     print('Yes')

# a = 15

# if a <= 20 and a >= 0:
#     print('yes')

# a = 20

# if 10 < a < 30:
#     print('True!!')


# print()

# for i in range(1, 10):
#     for j in range(1, 10):
#         print(i, "x", j, '=', i * j)
#     print()


# def add(a, b):
#     return a + b

# print(add(1, 3))

# print()

# def add(a, b):
#     print('함수의 결과:', a + b)

# add(3, 7)
# add(b=7, a=3)

# print()

# a = 0

# def func():
# 	global a # 함수 바깥의 변수를 참조하기 위해 global
# 	a += 1

# for i in range(10):
# 	func()

# print(a)

# array = [1,2,3,4,5]

# def func():
#     array.append(6)
#     print(array)

# func()

# print()

# def operator(a, b):
# 		add_var = a + b
# 		subtract_var = a - b
# 		multiply_var = a * b
# 		return add_var, subtract_var, multiply_var

# a, b, c = operator(7, 3)
# print(a, b, c)

# print()

# def add(a, b):
# 		return a + b

# # 일반적인 add() 메서드 사용
# print(add(3, 7))

# # 람다 표현식으로 구현한 add() 메서드
# print((lambda a, b: a + b)(3, 7))

# print()

# array = [('홍길동', 50), ('이순신', 32), ('아무개', 74)]

# def my_key(x):
# 		return x[1]

# print(sorted(array, key=my_key))
# print(sorted(array, key=lambda x:x[1]))


# print()
# list1 = [1,2,3,4,5]
# list2 = [6,7,8,9,10]

# # map 각각의 원소에 어떠한 함수를 적용하고자 할 때 사용
# result = map(lambda a, b: a+b, list1, list2)

# print(list(result))

# print()

# # sum()
# result = sum([1, 2, 3, 4, 5])
# print(result)

# # min(), max()
# min_result = min(7, 3, 5, 2)
# max_result = max(7, 3, 4, 2)
# print(min_result, max_result)

# # eval()
# result = eval("(3+5)*7")
# print(result)

# print()
# # sorted()
# result = sorted([9, 1, 8, 5, 4])
# reverse_result = sorted([9, 1, 8, 5, 4], reverse=True)
# print(result)
# print(reverse_result)

# # sorted() with key
# array = [('홍길동', 35), ('이순신', 75),('아무개', 50)]
# result = sorted(array, key=lambda x: x[1], reverse=True)
# print(result)


# print()
# from itertools import permutations

# data = ['A', 'B', 'C'] # 데이터 준비
# result = list(permutations(data, 3)) # 모든 순열 구하기
# print(result)

# print() 
# from itertools import combinations

# data = ['A', 'B', 'C'] # 데이터 준비

# result = list(combinations(data, 2)) # 2개를 뽑는 모든 조합 구하기
# print(result)

# print()

# from collections import Counter

# counter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])

# print(counter['blue']) # 'blue'가 등장한 횟수 출력
# print(counter['green']) # 'green'이 등장한 횟수 출력
# print(dict(counter)) # 사전 자료형으로 변환


# print()
# # 최대 공약수

# import math

# # 최소 공배수(LCM)를 구하는 함수
# def lcm(a, b):
# 		return a * b // math.gcd(a, b)

# a = 21
# b = 14

# print(math.gcd(21, 14)) # 최대 공약수(GCD) 계산
# print(lcm(21, 14)) # 최소 공배수(LCM) 계산


# print()
# n = 300
# count = 0

# # 큰 단위의 화폐부터 차례대로 확인하기
# array = [500, 100, 50, 10]

# for coin in array:
# 		count += n // coin # 해당 화폐로 거슬러 줄 수 있는 동전의 개수 세기
# 		n %= coin

# print(count)

# print()

# data = input()


# # 첫 번쨰 문자를 숫자로 변경하여 대입
# result = int(data[0])

# for i in range(1, len(data)):
# 		# 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기 보다는 더하기 수행
# 		num = int(data[i])
# 		if num <= 1 or result <= 1:
# 				result += num
# 		else:
# 				result *= num

# print(result)


from collections import deque


queue = deque()
queue.append(x, y)