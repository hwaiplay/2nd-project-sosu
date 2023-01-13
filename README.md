# 2nd-project-sosu
> 소소한 서울 사람들의 모임.

모임 중개 웹 플랫폼

![](../total-branch.png)

## 내 레포지토리에 저장하기

```
우측 상단 fork 클릭
```

```
자신의 레포지토리에 저장
```

## 프로젝트 임포트 하기

1. 이클립스의 ``Show View`` ▶ ``Other`` 메뉴를 선택합니다.

2. ``Git`` ▶ ``Git Repositories`` 메뉴를 선택하고, ``Open`` 버튼을 클릭합니다.

3. ``Git Repositories`` 탭에서 ``Clone a Git Repository`` 아이콘을 클릭 또는 우클릭 ▶ ``Clone a Git Repository`` 메뉴를 선택합니다.

4. ``github``에서 내려받을 프로젝트의 레포지토리(Repository) 주소를 복사합니다. (깃허브 레포지토리 우측 상단 ``code``)

5. 복사한 레포지토리(Repository) 주소를 URI란에 붙여 넣고, ``github`` 사용자 정보를 입력한 후 ``Next`` 버튼을 클릭합니다.

6. ``develop`` 브랜치 선택

7. ``Directory``란에 ``github``의 원격 저장소와 연결할 로컬 저장소 경로를 입력하고 ``Finish`` 버튼을 클릭합니다.

8. ``clone``이 되면, ``Git Repositories`` 탭에 ``github``의 원격 저장소가 정상적으로 연동됩니다.

9. ``Git Repositories`` 탭에서 내려받을 프로젝트를 선택하고 우클릭 ▶ ``Import Maven Projects`` 메뉴를 선택합니다.

10. ``Import source`` 경로를 확인하고, ``Finish`` 버튼을 클릭합니다.


https://smart-life-studio.tistory.com/170

## 프로젝트 푸쉬 하기



## 브랜치

* master 브랜치는 완벽하게 배포 가능한 상태를 유지합니다.

* develop 브랜치는 각자 작업한 기능을 ``merge`` 했을 때 오류가 없는 상태입니다.

* feature/'기능이름' 브랜치로 각각 작업합니다. 필요가 없어지면 제거 합니다.

* hot-pix 브랜치는 master 또는 develop 브랜치로 ``merge``를 완료한 후 오류가 발생했을 시 급하게 고치는데 사용합니다.

* 기본적으로 작업물은 본인의 레포지토리에 저장하고 하나의 기능을 완성하면 이곳의 레포지토리에 ``merge`` 하도록 합니다.

* master 브랜치로의 ``merge``는 5명의 인원이 동의해야 가능합니다. (branch rule 기능)
## 



## 



<!-- Markdown link & img dfn's -->
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
