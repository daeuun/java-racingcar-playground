## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 자동차 경주 게임 미션

---
## 구현할 기능 목록
### 1. Main, UI 로직 클래스 생성
1. `InputView` : 입력받은 자동차 이름 문자열 split(",") convert to List
2. `ResultView` : 자동차 전진한 결과

### 2. Car class 
일급 컬렉션으로 정의 (입력받은 car names)
- 각 자동차 이름에 대한 글자수를 검증한다.
- 각 자동차 이름에 대한 중복을 검증한다.

### 3. 자동차 전진하는 조건
- random number 생성