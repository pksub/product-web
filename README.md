# Product Web Application

Spring Boot와 Thymeleaf를 사용한 상품 관리 웹 애플리케이션입니다.

## 기술 스택

- Java 17
- Spring Boot 3.2.3
- Thymeleaf
- Gradle 8.5
- Bootstrap 5

## 프로젝트 구조

```
src/main/java/com/example/productweb/
├── ProductWebApplication.java
└── controller/
    └── ProductController.java

src/main/resources/
├── application.yml
└── templates/
    └── product/
        └── list.html
```

## 시작하기

### 필수 조건

- Java 17 이상
- Gradle 8.5 이상

### 설치 및 실행

1. 프로젝트 클론
```bash
git clone https://github.com/your-username/product-web.git
cd product-web
```

2. 프로젝트 빌드
```bash
./gradlew build
```

3. 애플리케이션 실행
```bash
./gradlew bootRun
```

4. 웹 브라우저에서 접속
```
http://localhost:8081/products
```

## API 엔드포인트

- `GET /products`: 상품 목록 조회

## 라이선스

이 프로젝트는 MIT 라이선스를 따릅니다. 