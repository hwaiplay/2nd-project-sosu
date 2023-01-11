# 2nd-project-sosu


1. Master Branch
제품으로 출시될 수 있는 브랜치
배포(Release) 이력을 관리하기 위해 사용. 즉, 배포 가능한 상태만을 관리한다.

2. Develop Branch
다음 출시 버전을 개발하는 브랜치
기능 개발을 위한 브랜치들을 병합하기 위해 사용. 즉, 모든 기능이 추가되고 버그가 수정되어 배포 가능한 안정적인 상태라면 develop 브랜치를 ‘master’ 브랜치에 병합(merge)한다.
평소에는 이 브랜치를 기반으로 개발을 진행한다.


3. Feature branch
기능을 개발하는 브랜치
feature 브랜치는 새로운 기능 개발 및 버그 수정이 필요할 때마다 ‘develop’ 브랜치로부터 분기한다. feature 브랜치에서의 작업은 기본적으로 공유할 필요가 없기 때문에, 자신의 로컬 저장소에서 관리한다.
개발이 완료되면 ‘develop’ 브랜치로 병합(merge)하여 다른 사람들과 공유한다.

‘develop’ 브랜치에서 새로운 기능에 대한 feature 브랜치를 분기한다.
새로운 기능에 대한 작업 수행한다.
작업이 끝나면 ‘develop’ 브랜치로 병합(merge)한다.
더 이상 필요하지 않은 feature 브랜치는 삭제한다.
새로운 기능에 대한 ‘feature’ 브랜치를 중앙 원격 저장소에 올린다.(push)
feature 브랜치 이름 정하기
master, develop, release-(RB_), or hotfix- 제외
[feature/기능요약] 형식을 추천 EX) feature/login


5. Hotfix Branch
출시 버전에서 발생한 버그를 수정 하는 브랜치
배포한 버전에 긴급하게 수정을 해야 할 필요가 있을 경우, ‘master’ 브랜치에서 분기하는 브랜치이다. ‘develop’ 브랜치에서 문제가 되는 부분을 수정하여 배포 가능한 버전을 만들기에는 시간도 많이 소요되고 안정성을 보장하기도 어려우므로 바로 배포가 가능한 ‘master’ 브랜치에서 직접 브랜치를 만들어 필요한 부분만을 수정한 후 다시 ‘master’브랜치에 병합하여 이를 배포해야 하는 것이다.

배포한 버전에 긴급하게 수정을 해야 할 필요가 있을 경우,
‘master’ 브랜치에서 hotfix 브랜치를 분기한다. (‘hotfix’ 브랜치만 master에서 바로 딸 수 있다.)
문제가 되는 부분만을 빠르게 수정한다.
다시 ‘master’ 브랜치에 병합(merge)하여 이를 안정적으로 다시 배포한다.
새로운 버전 이름으로 태그를 매긴다.
hotfix 브랜치에서의 변경 사항은 ‘develop’ 브랜치에도 병합(merge)한다.



https://gmlwjd9405.github.io/2018/05/11/types-of-git-branch.html
https://inpa.tistory.com/entry/GIT-%E2%9A%A1%EF%B8%8F-github-flow-git-flow-%F0%9F%93%88-%EB%B8%8C%EB%9E%9C%EC%B9%98-%EC%A0%84%EB%9E%B5
