## 초급개발자를위한 GitHub기반 협업개발방식워크샵
    
### 과정안내
|세션|내용|소요시간|비고사항|
|---|---|---|---|
|1|Git 살펴보기|Git Branches, Git Flows, Pull Request|10분|이론|
|2|협업개발원칙|협업개발 원칙 및 그라운드 룰, 적용 사례 |10분|이론|
|3|feature branch생성|Fork를 수행하고 일감을 확인하여 Branch 생성 |10분|실습|
|4|소스변경|리팩토링 수행 후 Commit과 일감연결|20분|실습|
|5|Pull Request 생성|PR Template 체크하기, 코드리뷰어 지정하기|10분|실습|
|6|Code Review|Code Review 수행, Comment, 피드백 달기|20분|실습|
|7|Merge & Release|PR Merge 수행, Release 생성|10분|실습|

### Centralized VC vs. Distributed VC
![gitfeature](https://user-images.githubusercontent.com/8435910/52028522-ad817800-2552-11e9-8877-c4b91ab2bfd7.GIF)

### [GitHub란 무엇인가?](https://youtu.be/w3jLJU7DT5E)

### Git브랜치 전략
![gitbranch](https://user-images.githubusercontent.com/8435910/52028327-f38a0c00-2551-11e9-9458-88961fb5c024.png)

### Pull Request 활용하여 개발하기
1. 저장소를 포크하고 로컬에 클론합니다. 
1. 수정을 위한 브랜치 생성하기.
1. 모든 관련있는 이슈 혹은 PR에서 지원중인 문서 참조하기 (ex. “close #37”)
1. 전후의 스크린 샷을 포함합니다.
1. 변경 부분을 테스트합니다! 
1. 프로젝트 스타일에 맞게 작업하고 Pull Request를 요청합니다. 

### 협업개발 적용 원칙
* Repository는 모듈 단위로 구성하고 Member와 권한을 관리합니다.
   - Repository는 하나의 모듈로 빌드 및 배포가 가능한 단위로 생성합니다.
   - Organization에서 Team을 등록하고 Repository에서 필요한 Team을 추가합니다.
   - Team을 등록하여 Admin, Write, Read 권한을 관리하며 Team으로 등록이 어려운 경우에는 Collaborators로서 등록합니다.(임시 사용자 등)
   - 접속하지 않는 Collaborators와 Team Member는 정기적으로 삭제합니다.
   - Repository 관리자를 지정하도록 합니다.
   - 보안상의 Issue가 없는 경우에는 Public으로 설정합니다.

 * Branch는 목적이나 역할 단위로 생성하여 관리하도록 합니다. 
   - Master/Dev/Release branch는 Protected 설정을 하여 직접 Commit을 금지합니다.
   - Master/Dev/Release branch는 Pull Request의 Merge를 통하여 코드를 반영합니다.
   - Merge 담당자는 코드리뷰 의견과 소스 충돌 등을 확인하고 이상이 없으면 Merge를 수행합니다. 
   - 만약 개발자가 Merge하는 경우에는 Merge 담당자의 승인을 반드시 받고 Merge합니다.
   - Feature Branch는 Infinite Branch에 Merge가 완료된 이후 정기적으로 삭제하도록 합니다.

 * 코드를 변경할 때에는 일감과 연계하여 의미 있는 단위로 수정합니다
   - 개발자는 Jira에서 Issue ID별로 Feature Branch를 생성합니다.
   - 개발자는 코드 수정 시에 종속성 없는 단위로 Commit 하며, 1시간 이내의 리뷰를 고려하여 200 LOC이하로 Commit을 수행합니다.
   - 하나의 일감은 하나의 PR로 작성하도록 합니다.
   - 개발자는 Commit Message를 작성할 때 how보다는 why가 잘 드러나도록 작성하며 Jira의 Issue와 연결하기 위하여 Issue ID를 작성합니다.
   - Commit Message Template을 설정하여 기본 Commit Message Format을 적용하도록 합니다.Pull Request Template을 활용하여 리뷰어에게 많은 정보를 제공하도록 합니다.

  * 변경하는 코드는 반드시 코드리뷰를 수행합니다.
    - Pull Request 생성 시에는 Code Review를 고려하여 기본 1일 1회, 최소한 Sprint 종료 3일전까지 생성하도록 합니다.
    - PR의 성격에 따른 적절한 라벨을 부여합니다.(NO TEST, NO Merge, Ready For Review 등)
    - Pull Request 생성시에는 Code Reviewer로 반드시 2명 이상 지정합니다. 
    - Code Reviewer는 구성원의 직급/나이 등에 상관없이 모두가 참여하도록 합니다.
    - 리뷰 요청된 코드는 24시간 이내에 리뷰되어야 합니다.
    - 리뷰어는 Inspection tool로 검증이 어려운  영역, 사람이 직접 판단가능한 영역(체크리스트 활용)을 위주로 리뷰합니다.( Naming의 적절성, 주석의 적절성, 가독성, 중복 기능 구현 여부 등)
    - 코드리뷰를 세분화 하는 경우 예를 들면 다음과 같은 수순으로 리뷰합니다.(CodeBot 자동 리뷰 → Peer Review → 모듈리더 리뷰 → 아키텍트 리뷰)
    - 리뷰어는 리뷰 유형(Good, FixMe, CheckMe, Info)을 입력하고 문제의 검출/해결방안을 구체적으로 작성합니다. (리뷰 목적에 부합하지 않는 Comment 작성 지양)
    - 리뷰어는 리뷰 대상인 코드에 대해서만 Comment를 작성합니다.
    - 개발자는 'FixMe'로 체크된 의견에 대해서는 반드시 코드를 수정하거나 피드백을 남기도록 합니다.
    - 개발자는 당장 적용은 힘드나 추후에 적용할 리뷰 의견은 Jira의 일감으로 등록하도록 합니다.
    - Comment가 길어질 경우, 오프라인으로 논의하고, 오프라인 결과를 Comment로 작성합니다.
    - Unit Test가 실패한 경우에는 Pull Request를 반영하지 않습니다.

### [참고자료]Git 브랜치 전략
[Professional Guides: Workflow Strategies](https://www.youtube.com/watch?v=aJnFGMclhU8)

[Write better code](https://github.com/features/code-review/)

[Code Review on GitHub](https://www.youtube.com/watch?v=HW0RPaJqm4g)

[About pull request reviews](https://help.github.com/en/articles/about-pull-request-reviews)


### [참고자료]Commit과 코드리뷰 팁
* Commit 작성
  - Commit은 단일 기능 단위로 구성
  - 코드리뷰를 고려하여 200LOC 이하로 작성(10개 미만의 파일)
  - 작성방법
   제목 : 수정사항을 한 줄로 요약
   내용 : 한 행을 띄고 수정 내용에 대한 이해가 쉽도록 작성
* 코드리뷰
  - 해결방안에 대한 구체적인 가이드
  - 아낌없는 칭찬
  - 수정된 코드에 대하여만 리뷰 집중
 
__※ Google의 경우  하나의 PR은 2명의 리뷰어를 지정하고 코드 수정 이후 4시간 이내에 리뷰를 받으며 24시간 이내에 Merge를 하고 PR당 7건의 Commit과 10개 미만의 파일, 평균 12.5개의 리뷰 Comment를 작성한다고 합니다.__

### [참고자료]협업개발 사례 - [Elasticsearch](https://github.com/elastic/elasticsearch)
 * Release Branch와 Feature Branch 관리
 * PR 본문과 일감 연계
 * PR 단위 상세정보를 Labeling하여 정보 제공(버전정보, 기능구분 등)
 * PR Merge시에 체크사항으로 빌드 여부 확인

### [참고자료] 협업개발 사례 - [Jenkins](https://github.com/jenkinsci/jenkins)
 * Submitter checklist 운영
   - Jira의 일감이 잘 설명되었는지, 변경로그가 잘 기록되었는지 확인
   - Release Branch와 Feature Branch 관리
 * Desired Reviewer 등록(@mention 사용)
 * Build Job 연계하여 빌드 확인
 
