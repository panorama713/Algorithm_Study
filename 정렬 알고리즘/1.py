array = [7,5,9,0,3,1,6,2,4,8]

for i in range(len(array)):
		min_index = i # 가장 작은 원소의 인덱스
		for j in range(i + 1, len(array)):
				if array[min_index] > array[j]:
						min_index = j
		array[i], array[min_index] = array[min_index], array[i] # 스와프

print(array)

# 퀵 정렬 소스코드
array = [5,7,9,0,3,1,6,2,4,8]

def quick_sort(array, start, end):
		if start >= end: # 원소가 1개인 경우 종료
				return
		pivot = start # 피벗은 첫 번째 ㅐ원소
		left = start + 1
		right = end
		# left의 인덱스 보다 right의 인덱스가 작다면 엇갈린것
		while(left <= right):  
				# 피벗보다 큰 데이터를 찾을 때까지 반복
				while(left <= end and array[left] <= array[pivot]):
						left += 1
				# 피벗보다 작은 데이터를 찾을 때까지 반복
				while(right > start and array[right] >= array[pivot]):
						right -= 1
				if(left > right): # 엇갈렸다면 작은 데이터와 피벗을 교체
						array[right], array[pivot] = array[pivot], array[right]
				else: # 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
						array[left], array[right] = array[right], array[left]
		# 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
		quick_sort(array, start, right -1)
		quick_sort(array, right + 1, end)

quick_sort(array, 0, len(array) - 1)
print(array)


# 계수 정렬 
# 모든 원소의 값이 0보다 크거나 같다고 가정
array = [7,5,9,0,3,1,6,2,9,1,4,8,0,5,2]
# 모든 범위를 포함하는 리스트 선언(모든 값은 0으로 초기화)
# max(iterable) = 가장 큰 데이터를 반환
count = [0] * (max(array) + 1)

for i in range(len(array)):
		count[array[i]] += 1 # 각 데이터에 해당하는 인덱스의 값 증가

for i in range(len(count)): # 리스트에 기록된 정렬 정보 확인
		for j in range(count[j]):
				print(i, end=' ') # 띄어쓰기를 구분으로 등장한 횟수만큼 인덱스 출력


                