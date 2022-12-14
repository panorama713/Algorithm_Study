# 정렬된 배열에서 특정 수의 개수 구하기
from bisect import bisect_left, bisect_right

n, x = map(int,input().split())
array = list(map(int, input().split()))

# 값이 [left_value, right_value]인 데이터의 개수를 반환하는 함수
def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a,right_value)
    left_index = bisect_left(a, left_value)
    return right_index - left_index

count = count_by_range(array, x, x)

# 값이 x인 원소가 존재하지 않는다면
if count == 0:
    print(-1)
# 값이 x인 원소가 존재한다면
else:
    print(count)