# Ez SHOT SE (Android)

이 저장소는 GitHub Actions로 **Debug APK를 자동 생성**하기 위한 CI-ready 베이스라인입니다.

## APK 만들기
1. Actions 탭 → **Build EzSHOTSE Debug APK**
2. Run workflow
3. 완료 후 Artifacts에서 **EzSHOTSE-debug-apk** 다운로드

## 다음 단계
- UVC 프리뷰/캡처 모듈(libuvc/UVCCamera) 연결
- Snap shot(외부 트리거) + 손떨림 방지 캡처 로직 추가
- 환자/치아번호 메타데이터 저장 구조 추가
