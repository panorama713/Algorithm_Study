# 알파벳 대문자와 숫자(0-9)로만 구성된 문자열이 입력으로 주어집니다.
# 이때 모든 알파벳을 오름차순으로 정렬하여 이어서 출력한 뒤에, 
# 그 뒤에 모든 숫자를 더한 값을 이어서 출력

from curses.ascii import isalpha
from dataclasses import dataclass
import re
data = input()
st = list(re.sub('[^A-Z]','', data))
num = list(re.sub('[^0-9]','',data))

st.sort()

print(st)

for s in st:
    print(s, end='')

if sum(map(int, num)) > 0:
    print(sum(map(int, num)))



# 다른 풀이
result = []
value = 0

# 문자를 하나씩 확인하며
for x in data:
    # 알파벳인 경우 결과 리스트에 삽입
    if x.isalpha():
        result.append(x)
    # 숫자는 따로 더하기
    else:
        value += int(x)

# 알파벳을 오름차순으로 정렬
result.sort()

# 숫자가 하나라도 존재하는 경우 가장 뒤에 삽입
if value != 0:
    result.append(str(value))

# 최종 결과 출력(리스트를 문자열로 변환하여 출력)
# ''.join : 매개변수로 들어온['a', 'b', 'c'] 이런 식의 리스트를 
# 'abc'의 문자열로 합쳐서 반환 해주는 함수
# ''안에는 구분자를 넣을 수 있음 ex)'_'.join = "a_b_c"
print(''.join(result))
