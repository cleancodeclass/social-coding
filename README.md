## GitHub 기반 협업개발 Pro - 이론교육
    
### 과정안내
|세션|내용|소요시간|비고사항|
|---|---|---|---|
|1|GitFlow 살펴보기|Git Branches, Pull Request|10분|이론|
|2|SDS 협업개발원칙|협업개발 원칙 및 그라운드 룰, 적용 사례 |10분|이론|
|3|feature branch생성|Fork를 수행하고 일감을 확인하여 Branch 생성 |10분|실습|
|4|소스변경|리팩토링 수행 후 Commit과 일감연결|20분|실습|
|5|Pull Request 생성|PR Template 체크하기, 코드리뷰어 지정하기|10분|실습|
|6|Code Review|Code Review 수행, Comment, 피드백 달기|20분|실습|
|7|Merge & Release|PR Merge 수행, Release 생성|10분|실습|

### Centralized VC vs. Distributed VC
![gitfeature](https://user-images.githubusercontent.com/8435910/52028522-ad817800-2552-11e9-8877-c4b91ab2bfd7.GIF)

### Git 브랜치 전략
[Professional Guides: Workflow Strategies](https://www.youtube.com/watch?v=aJnFGMclhU8)

### Pull Request란 무엇인가?
- [Write better code](https://github.com/features/code-review/)
- [Code Review on GitHub](https://www.youtube.com/watch?v=HW0RPaJqm4g)
- [About pull request reviews](https://help.github.com/en/articles/about-pull-request-reviews)

### Pull Request 활용하기(오픈소스 기준)
1. 저장소를 포크하고 로컬에 클론합니다. 
1. 수정을 위한 브랜치 생성하기.
1. 모든 관련있는 이슈 혹은 PR에서 지원중인 문서 참조하기 (ex. “close #37”)
1. 전후의 스크린 샷을 포함합니다.
1. 변경 부분을 테스트합니다! 
1. 프로젝트 스타일에 맞게 작업하고 Pull Request를 요청합니다. 


* 참고
- [Creating a pull request template](http://help.github.com/en/articles/creating-a-pull-request-template-for-your-repository)
- [Fork a repo](http://help.github.com/en/articles/fork-a-repo)  

### Commit과 코드리뷰 팁
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

### 협업개발 사례 - [Elasticsearch](https://github.com/elastic/elasticsearch)
 * Release Branch와 Feature Branch 관리
 * PR 본문과 일감 연계
 * PR 단위 상세정보를 Labeling하여 정보 제공(버전정보, 기능구분 등)
 * PR Merge시에 체크사항으로 빌드 여부 확인

### 협업개발 사례 - [Jenkins](https://github.com/jenkinsci/jenkins)
 * Submitter checklist 운영
   - Jira의 일감이 잘 설명되었는지, 변경로그가 잘 기록되었는지 확인
   - Release Branch와 Feature Branch 관리
 * Desired Reviewer 등록(@mention 사용)
 * Build Job 연계하여 빌드 확인
 
### 협업개발 사례 - [삼성전자 ChatBot SDK]
 * 개발자가 원격 Repository를 Fork 하여 개발자 Repo에서 Feature Branch를 생성하여 개발
 * 개발이 완료되면 개발자 Repo에서 원격 Repo로 PR 생성하여 반영하며 이 단계에 코드리뷰를 반드시 수행함
 * 코드 “검사” 가 아닌 코드 “소개” 라는 마음으로 편안하게!!

 * Ground Rule 

 * Code Quality ( Recommendation )

 

### 협업개발 사례 - MS Azure
* 개발자가 변경 사항을 Feature를 생성하여 작업하고 PR을 수행하여 통합하고 항상 Release가 가능한 형태로 유지
![gitbranch](https://user-images.githubusercontent.com/8435910/52028327-f38a0c00-2551-11e9-9458-88961fb5c024.png)
* Pull-Request workflow를 사용하여 코드가 trunk에 통합되기 전에 continuous code review가 가능
* Code Integration
  - Work item association
  - Continuous integration(Build succeed, test pass)
  - Minimum number of reviewers(3 Reviewers), Users cannot simply merge their own PR
  - All code review comments must be resolved
  - Complete pull request will enforce a merge strategy

### 협업개발 적용 원칙 - 삼성 SDS
* Repository는 모듈 단위로 구성하고 Member와 권한을 관리합니다.
   - Repository는 하나의 모듈로 빌드 및 배포가 가능한 단위로 생성합니다.
   - Organization에서 Team을 등록하고 Repository에서 필요한 Team을 추가합니다.
   - Team을 등록하여 Admin, Write, Read 권한을 관리하며 Team으로 등록이 어려운 경우에는 Collaborators로서 등록합니다.(임시 사용자 등)
   - 접속하지 않는 Collaborators와 Team Member는 정기적으로 삭제합니다.(기능검토. 일정 기간 사용하지 않는 사용자 알림 기능
   - Repository 관리자를 지정하도록 합니다.
   - 보안상의 Issue가 없는 경우에는 Public으로 설정합니다.

 * Branch는 목적이나 역할 단위로 생성하여 관리하도록 합니다. 
   - Master/Dev/Release branch는 Protected 설정을 하여 직접 Commit을 금지합니다.
   - Master/Dev/Release branch는 Pull Request의 Merge를 통하여 코드를 반영합니다.
   - Merge 담당자는 코드리뷰 의견과 소스 충돌 등을 확인하고 이상이 없으면 Merge를 수행합니다. 
   - 만약 개발자가 Merge하는 경우에는 Merge 담당자의 승인을 반드시 받고 Merge합니다.
   - Feature Branch는 Infinite Branch에 Merge가 완료된 이후 정기적으로 삭제하도록 합니다.(기능검토. Merge 완료된 이후 일정 기간 경과시 자동으로 Branch를 삭제하는 기능)

 * 코드를 변경할 때에는 일감과 연계하여 의미 있는 단위로 수정합니다
   - 개발자는 Jira에서 Issue ID별로 Feature Branch를 생성합니다.
   - 개발자는 코드 수정 시에 종속성 없는 단위로 Commit 하며, 1시간 이내의 리뷰를 고려하여 200 LOC이하로 Commit을 수행합니다.
   - 하나의 일감은 하나의 PR로 작성하도록 합니다.
   - 개발자는 Commit Message를 작성할 때 how보다는 why가 잘 드러나도록 작성하며 Jira의 Issue와 연결하기 위하여 Issue ID를 작성합니다.(기능검토. Commit Message에 Issue ID가 등록되지 않으면 PUSH Reject, Commit Template 적용)
   - Commit Message Template을 설정하여 기본 Commit Message Format을 적용하도록 합니다.Pull Request Template을 활용하여 리뷰어에게 많은 정보를 제공하도록 합니다.

  * 변경하는 코드는 반드시 코드리뷰를 수행합니다.
    - Pull Request 생성 시에는 Code Review를 고려하여 기본 1일 1회, 최소한 Sprint 종료 3일전까지 생성하도록 합니다.(Code Review 기간을 고려하여, 너무 촉박하게 Merge 계획을 잡지 않도록 합니다.)
    - PR의 성격에 따른 적절한 라벨을 부여합니다.(NO TEST, NO Merge, Ready For Review 등)
    - Pull Request 생성시에는 Code Reviewer로 반드시 2명 이상 지정합니다. 
    - Code Reviewer는 구성원의 직급/나이 등에 상관없이 모두가 참여하도록 합니다.
    - 리뷰 요청된 코드는 24시간 이내에 리뷰되어야 합니다.(기능검토. Review 요청 후 일정시간 이내 리뷰 미수행시 재알림)
    - 리뷰어는 Inspection tool로 검증이 어려운  영역, 사람이 직접 판단가능한 영역(체크리스트 활용)을 위주로 리뷰합니다.( Naming의 적절성, 주석의 적절성, 가독성, 중복 기능 구현 여부 등)
    - 코드리뷰를 세분화 하는 경우 예를 들면 다음과 같은 수순으로 리뷰합니다.(CodeBot 자동 리뷰 → Peer Review → 모듈리더 리뷰 → 아키텍트 리뷰)
    - 리뷰어는 리뷰 유형(Good, FixMe, CheckMe, Info)을 입력하고 문제의 검출/해결방안을 구체적으로 작성합니다. (리뷰 목적에 부합하지 않는 Comment 작성 지양)
    - 리뷰어는 리뷰 대상인 코드에 대해서만 Comment를 작성합니다.
    - 개발자는 'FixMe'로 체크된 의견에 대해서는 반드시 코드를 수정하거나 피드백을 남기도록 합니다.
    - 개발자는 당장 적용은 힘드나 추후에 적용할 리뷰 의견은 Jira의 일감으로 등록하도록 합니다.(기능검토.코드리뷰 의견을 Jira 일감으로 등록)
    - Comment가 길어질 경우, 오프라인으로 논의하고, 오프라인 결과를 Comment로 작성합니다.
    - Unit Test가 실패한 경우에는 Pull Request를 반영하지 않습니다.

  
### Git브랜치 전략 - 삼성 SDS 
  
## GitHub 기반 협업개발 Pro - 실습교육

### Code Smell 찾아 보기

<pre><code>
package collection;

public class List1 {
	private Object[] elements = new Object[10];
	private boolean readOnly;
	private int size = 0;

	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;
			
			if ( newSize > elements.length) {
				Object[] newElements = new Object[elements.length + 10];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
				}

				elements = newElements;
			}

			elements[size] = element;
			size++;
		}
	}
}
</code></pre>

* Magic Number
  - 특정 숫자가 상수형태로 정의되어 있는 코드를 의미한다.
  - 변경될 가능성이 있으면 여러 곳을 고쳐야 할 수 있다.
  - 코드에서 어떻게 처리되고 있는지 알아내기 힘들다.
  - 상수선언 기능을 이용하여 가독성을 높이고 유지보수성을 향상시킨다.

* 부정형 코드 블럭
  - 부정형은 긍정형보다 이해하기 힘들다.

* 복잡한 if 조건문
  - if 조건문안의 내용이 복잡하다면 가독성 있는 함수로 추출하도록 한다.
  - 코드의 용도가 명확하게 드러나고 로직의 흐름을 이해하기 쉽다.

* 복잡한 if 절
  - if 절안의 내용이 복잡하다면 가독성 있는 함수로 추출하도록 한다.
  - 코드의 용도가 명확하게 드러나고 로직의 흐름을 이해하기 쉽다.

* 복잡한 if 절 밖의 로직
  - if 절 밖의 로직의 내용이 복잡하다면 가독성 있는 함수로 추출하도록 한다.
  - 코드의 용도가 명확하게 드러나고 로직의 흐름을 이해하기 쉽다.

### 팀명 정하고 역할자 나누기
* 개발리더
  - 리팩토링 브랜치를 생성한다.
  - Pull Request에 대한 Merge를 수행한다.
  - 릴리즈 브랜치를 생성한다.
  - 배포를 위한 릴리즈를 수행한다.

* 개발자
  - Feature 브랜치를 생성한다.
  - Pull Request를 생성한다.
  - 다른 개발자가 생성한 Pull Request에 대하여 코드리뷰를 수행한다.

### 실습진행 순서
1. 자신의 Github 계정으로 Fork 하기
     - oooooooo
1. 브랜치 생성하기
     - Suffix는 영문네임으로
     - GitHub에서 생성된 브랜치 확인하기
     - GitHub에서 브랜치간 차이점 확인하기
1. 소스 코드를 수정하고 검증 후 PUSH하기.
     - Commit Message 신경 써서 작성하기
     - Commit Message에 이슈 넘버 넣기
     - IF절 밖의 구문 함수 추출 #SOCIALCODE-6
     - IF문 밖으로 Extract Method를 이용하여 addElement()라는 별도의 함수로 추출하였습니다.
1. Github에서 연결된 Commit 확인하기
1. GitHub에서 Pull Request 생성하기
     - Pull Request Template 확인하기
1. 코드리뷰 수행하기
     - 코드리뷰 의견 작성하기
     - 리뷰어는 코드리뷰 의견에 피드백 주기
1. Pull Request Merge하기
1. Pull Request Conflict 확인하기
     - Conflict 해결하기
1. Feature 브랜치 삭제하기
1. Dev와 Master의 차이점 보기
1. Dev -> Master Pull Request 생성하기
1. Release Tag 생성하기

### 코드 참고하기
<pre><code>
//변경전 코드
package collection;

public class List1 {
	private Object[] elements = new Object[10];
	private boolean readOnly;
	private int size = 0;

	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;
			
			if ( newSize > elements.length) {
				Object[] newElements = new Object[elements.length + 10];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
				}

				elements = newElements;
			}

			elements[size] = element;
			size++;
		}
	}
}
</code></pre>
<pre><code>
//변경후 코드
package collection;

public class List1 {
	private static final int STORE_SIZE_INCREMENT = 10;
	private Object[] elements = new Object[STORE_SIZE_INCREMENT];
	private boolean readOnly;
	private int size = 0;

	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;
			
			if ( newSize > elements.length) {
				Object[] newElements = new Object[elements.length + STORE_SIZE_INCREMENT];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
				}

				elements = newElements;
			}

			elements[size] = element;
			size++;
		}
	}
}
</code></pre>

### 교육피드백
