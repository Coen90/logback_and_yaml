# logback_and_yaml

## yml파일을 이용하여 데이터를 저장하고, 실행환경별로 다른 값을 사용하는 테스트 진행

1. spring annotation @Value를 이용하여 데이터 얻어오기
  - 데이터를 codes: dev-a, dev-b, dev-c, dev-d, dev-e 의 형태로 담더라도, 저장하는 데이터 타입이 String이면 String으로, 배열이면 배열로 담기는걸 확인함.
  
2. 빌드시에 goal에 사용할 프로필을 지정하거나, 실행 서버등을 변경하여 빌드 완료된 데이터를 확인함.

3. 빌드할때 지정한 프로필이 있더라도, 서버를 구동시킬때 재변경이 가능한지 확인함.
  - java -jar -DLOG_FILE=test222 -Dserver.port=8081 -Dspring.profiles.active=staging yml-test-0.0.1-SNAPSHOT.jar 



자세한 내용은 블로그에 정리했습니다. 
<br/>
<br/>

[Intellij로 yml 파일 핸들링, 빌드, 로컬배포하기 (1탄 .yml 파일 핸들링 편)](https://velog.io/@coen/Intellij%EB%A1%9C-yml-%ED%8C%8C%EC%9D%BC-%ED%95%B8%EB%93%A4%EB%A7%81-%EB%B9%8C%EB%93%9C-%EB%B0%B0%ED%8F%AC%ED%95%98%EA%B8%B0-1%ED%83%84-.yml-%ED%8C%8C%EC%9D%BC-%ED%95%B8%EB%93%A4%EB%A7%81-%ED%8E%B8)

[Intellij로 yml 파일 핸들링, 빌드, 로컬배포하기 (2탄 Maven, Gradle 빌드 편)](https://velog.io/@coen/Intellij%EB%A1%9C-yml-%ED%8C%8C%EC%9D%BC-%ED%95%B8%EB%93%A4%EB%A7%81-%EB%B9%8C%EB%93%9C-%EB%B0%B0%ED%8F%AC%ED%95%98%EA%B8%B0-2%ED%83%84-Maven-Gradle-%EB%B9%8C%EB%93%9C-%ED%8E%B8)

## Logback
1. 프로필별로 다른 이름의 로그파일을 생성하도록 함
2. Log파일의 rolling설정을 공부함.
3. 실무에서 로그백 설정을 이용하였던 경험(아직 1번...)이 있지만 자주 사용하지 않다보니 까먹음 정리가 다시 필요할 것으로 보임.
