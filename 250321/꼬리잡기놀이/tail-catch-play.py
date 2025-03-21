from collections import deque
n,m,k = map(int, input().split())
# 방향 탐색
direction = [(0,1),(1,0),(0,-1),(-1,0)]
arr = []
for i in range(n):
    arr.append(list(map(int, input().split())))

score = 0
# 팀을 넣을 딕셔너리
team = dict()
# 처음 초기화할 때 사용할 방문 배열
visit = [[False] * n for _ in range(n)]
def check(x,y):
    return 0 <= x < n and 0<= y < n

def bfs(x,y,No):
    global team
    q = deque()
    visit[x][y] = True
    q.append((x,y))
    # 머리사람부터 팀 만들어 넣기
    team[No] = []
    team[No].append((x,y))
    while q:
        a,b = q.popleft()
        for i in range(4):
            nx,ny = a + direction[i][0], b + direction[i][1]
            if not check(nx,ny): continue
            if not visit[nx][ny] and arr[nx][ny] == 2:
                visit[nx][ny] = True
                team[No].append((nx,ny))
                q.append((nx,ny))
    # 꼬리 사람 찾기
    before_tail = team[No][-1]
    for i in range(4):
        nx,ny = before_tail[0] + direction[i][0], before_tail[1] + direction[i][1]
        if check(nx,ny) and arr[nx][ny] == 3:
            team[No].append((nx,ny))
            return

# 각 팀을 dict에 1 - m 번까지 (x,y) 튜플 리스트로 초기화
teamN = 1
for i in range(n):
    for j in range(n):
        if not visit[i][j] and arr[i][j] == 1:
            bfs(i,j, teamN)
            teamN += 1

# 시뮬레이션 시작
for r in range(k):
    # 우선 머리 사람따라 한 칸 이동
    for k in team.keys():
    # t = [(x,y),(x1,y1)...]
        t = team[k]
        headPerson = t[0]
        hx,hy = headPerson[0], headPerson[1]
        # 이동하고 난 뒤 위치를 저장할 변수
        bx, by = 0,0
        # 머리사람 이동
        for d in range(4):
            nx,ny = hx + direction[d][0], hy + direction[d][1]
            if not check(nx,ny): continue
            # 4거나 3인 경우만 찾아서 이동
            if arr[nx][ny] == 4 or arr[nx][ny] == 3:
                bx,by = hx,hy
                arr[nx][ny] = 1
                t[0] = (nx,ny)
                break
        # 몸통 - 꼬리 이동
        for p in range(1,len(t)):
            cx,cy = t[p][0],t[p][1] 
            # 꼬리 부분이면 3으로 아니면 2로
            if p == len(t) - 1: arr[bx][by] = 3
            else: arr[bx][by] = 2
            t[p] = (bx,by)
            bx,by = cx,cy
    # 공발사
    hit = False
    hitTeam = 0
    dir_idx = r // n
    dir_idx %= 4
    line_idx = r % n
    # 왼쪽에서 발사
    if dir_idx == 0:
        for j in range(n):
            if hit: break
            for t in team.keys():
            # 머리사람부터 맞는지 확인
                if hit: break
                for idx,cord in enumerate(team[t]):
                    # 공이 맞으면 멈추고 점수 계산 후, 맞은 팀
                    if cord[0] == line_idx and cord[1] == j:
                        score += (idx+1) * (idx+1)
                        hit = True
                        hitTeam = t
                        break
    # 아래에서 발사
    elif dir_idx == 1:
        for i in range(n-1,-1,-1):
            if hit: break
            for t in team.keys():
                if hit: break
                for idx,cord in enumerate(team[t]):
                    if cord[0] == i and cord[1] == line_idx:
                        score += (idx+1) * (idx+1)
                        hit = True
                        hitTeam = t
                        break
    # 오른쪽에서 발사
    elif dir_idx == 2:
        for i in range(n-1,-1,-1):
            if hit: break
            for t in team.keys():
                if hit: break
                for idx,cord in enumerate(team[t]):
                    if cord[0] == line_idx and cord[1] == i:
                        score += (idx+1) * (idx+1)
                        hit = True
                        hitTeam = t
                        break
    # 위에서 발사
    else:
        for i in range(n):
            if hit: break
            for t in team.keys():
                if hit: break
                for idx,cord in enumerate(team[t]):
                    if cord[0] == i and cord[1] == line_idx:
                        score += (idx+1) * (idx+1)
                        hit = True
                        hitTeam = t
                        break
    # 공 맞은 팀 머리와 꼬리 바꾸기
    if hit:
        change_team = team[hitTeam]
        team[hitTeam] = change_team[::-1]
        team[-hitTeam] = team.pop(hitTeam)

print(score)