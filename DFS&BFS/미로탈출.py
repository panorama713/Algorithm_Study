# def dfs(x, y):
#     # 에외처리
#     if x < 0 or x >= n or y < 0 or y >= m:
#         return False
#     # 현재 노드를 방문 했을때 괴물이 없으면 이동
#     if graph[x][y] == 1:
#         graph[x][y] = 2
#         # 하단으로 먼저 이동
#         dfs(x + 1, y)
#         if 
#     return False

# # 입력을 받기위한 코드
# n, m = map(int, input().split())
# graph = []

# # graph에 값 넣기
# for i in range(n):
#     graph.append(list(map(int, input())))

# dfs(0,0)

# count = 0
# for i in range(n):
#     count += graph[i].count(2)
# print(count)


# -----
# 모든 이동가능한 요소에 도착할 때 마다 거리를 표시
# BFS 소스코드 구현
from collections import deque

# N, M을 공백을 기준으로 구분하여 입력 받기
n, m = map(int, input().split())
# 2차원 리스트의 맵 정보 입력 받기
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

# 이동할 네 가지 방향 정의 (상, 하, 좌, 우)
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# BFS 소스코드 구현
def bfs(x, y):
    # 큐(Queue) 구현을 위해 deque 라이브러리 사용
    queue = deque()
    queue.append((x, y))
    # 큐가 빌 때까지 반복하기
    while queue:
        print('queue : ', queue)
        x, y = queue.popleft()
        print('2 : ', x, y)
        # 현재 위치에서 4가지 방향으로의 위치 확인
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # 미로 찾기 공간을 벗어난 경우 무시
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            # 벽인 경우 무시
            if graph[nx][ny] == 0:
                continue
            # 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))
    # 가장 오른쪽 아래까지의 최단 거리 반환
    return graph[n - 1][m - 1]

# BFS를 수행한 결과 출력
print(bfs(0, 0))