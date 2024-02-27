# java-ladder

사다리 타기 미션 저장소

## 명칭 정의

1. 사다리의 `|`으로 이루어진 세로 한 줄 - 세로라인
2. 사다리의 `-`으로 이루어진 가로 한 줄 - 가로라인
3. 사다리의 `|-----|`으로 이루어진 가로 한 줄 - 층

## 기능 요구사항

1.
    - [x] 참여할 사람의 이름을 입력받는다.
        - [x] 사람 이름은 쉼표로 구분한다.
        - [x] 사람 이름은 1자 이상 5자 이하여야 한다.
        - [x] 사람 이름은 공백으로만 이루어질 수 없다.
        - [x] 사람 이름은 중복을 허용하지 않는다.
        - [x] 사람은 2명 이상 50명 이하여야 한다.
        - [x] 사람 이름에 `종료`를 사용할 수 없다.
2.
    - [x] 실행 결과를 입력받는다.
        - [x] 실행 결과는 쉼표로 구분한다.
        - [x] 실행 결과는 1자 이상 5자 이하여야 한다.
        - [x] 실행 결과는 공백으로만 이루어질 수 없다.
        - [x] 실행 결과는 사람 수와 동일해야 한다.
3.
    - [x] 최대 사다리 높이를 입력받는다.
        - [x] 사다리 높이는 1개 이상 100개 이하의 정수여야 한다.
4.
    - [x] 사다리를 생성한다.
        - [x] 사다리 가로라인은 `|-----|-----|`와 같이 연속할 수 없다.
5.
    - [x] 실행 결과를 출력한다.
        - [x] 사람 이름은 5자 기준으로 출력한다.
        - [x] 가로라인은 `-` 5개로 표현한다.
        - [x] 세로라인은 사다리 높이만큼 `|` 개수로 표현한다.
6.
    - [x] 결과를 계산한다.
7.
    - [x] 결과를 보고 싶은 사람을 입력받는다.
        - [x] 결과를 보고 싶은 사람은 참가자 내에 있어야 한다.
        - [x] `all`을 입력하면 모든 참가자의 결과를 출력한다.
        - [x] `종료`를 입력하면 프로그램을 종료한다.

## 기능 구현사항

1. model
    - Height
        - 높이 범위 검증
        - 해당 층이 높이의 끝인지 확인
    - Line
        - 한 칸 만들기
        - 한 층 만들기
        - 해당 위치에 칸이 있는지 확인
    - Ladder
        - 사다리 만들기
        - 해당 위치가 사다리를 다 탄 것인지 확인
        - 특정 층, 특정 위치에서 왼쪽으로 이동 가능한지 확인
        - 특정 층, 특정 위치에서 오른쪽으로 이동 가능한지 확인
    - Prizes
        - 실행 결과 글자수 검증
        - 실행 결과 공백 검증
        - 실행 결과가 참가자 수와 같은 수인지 검증
    - LadderResult
        - 특정 층, 측정 위치에서 이동 확인 후 위치 조정
        - 사다리 결과 계산
        - 사다리 각자의 결과 확인
    - Name
        - 이름 없음 검증
        - 이름 길이 검증
        - 이름 불가능 단어 사용 검증
        - 주어진 이름이 동일한 이름인지 확인
    - Participants
        - 주어진 숫자가 참가자 수와 일치하는지 확인 
        - 주어진 이름이 참가자인지 확인 
        - 주어진 이름이 몇 번째 참가자인지 확인
        - 참가자 수 검증
        - 참가자 이름 중복 검증
2. View
    - InputView
        - 이름 입력
        - 이름이 구분자로 끝나는지 여부 검증
        - 높이 입력
        - 높이가 정수인지 여부 검증
    - OutputView
        - 결과 출력
3. Utils
    - 불리안 생성

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
