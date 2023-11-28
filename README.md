# Remote-SBC-ARM-Cortex-A7-processor-controller (

## Content
This code is open source, written by Dr. Ibraheem, and I don't own any of it. It is made open source based on the Apache License. View the LICENSE file for more information.

## Application
This program is a GUI controller that works and is tested for Windows 10 OS. It utilizes the SSH (Secure Shell) protocol commands to control any SBC (Single Board Computer) that uses the SSH protocol. This code is tested and verified after building it. It can control 4 Raspberry Pis at once. This program also contains memory-based timers to control the state of ON and OFF for these devices.

This project suitable to control TV broad cast RF signals on 8 channels per SBC.

This project places security password and hashed with 3 layers of hashing technique AES, ECB, Base64

## To Download and Build the Project
1. Download RJJ.zip to your computer.
2. Start NetBeans.
3. Import the project as a ZIP file.
4. Clean and build.

## Notes
- Notice: You might need to add JDK13 library.
- Notice: You might need to add jsch-0.1.55.jar for SSH.

NetBeans → Right-click on project → Properties → Libraries → Add Library.

------------------------------------------------------

# 원격-SBC-ARM-Cortex-A7-프로세서-컨트롤러

## 내용
이 코드는 Dr. Ibraheem에 의해 작성된 오픈 소스로, 나는 그것의 소유자가 아니다. 이는 Apache 라이선스를 기반으로 공개되었습니다. 자세한 정보는 LICENSE 파일을 참조하십시오.

## 응용 프로그램
이 프로그램은 Windows 10 운영 체제에서 동작하고 테스트된 GUI 컨트롤러입니다. 이는 SSH(보안 셸) 프로토콜 명령을 사용하여 SSH 프로토콜을 사용하는 모든 SBC(싱글 보드 컴퓨터)를 제어합니다. 이 코드는 빌드 후에 테스트되고 검증되었습니다. 한 번에 4개의 Raspberry Pi를 제어할 수 있습니다. 또한 이 프로그램에는 이러한 장치들의 ON 및 OFF 상태를 제어하기 위한 메모리 기반 타이머도 포함되어 있습니다.

이 프로젝트는 SBC당 8개 채널에서 TV 방송 RF 신호를 제어하는 ​​데 적합합니다.

## 프로젝트 다운로드 및 빌드하기
1. RJJ.zip을 컴퓨터에 다운로드합니다.
2. NetBeans를 시작합니다.
3. ZIP 파일로 프로젝트를 가져옵니다.
4. 정리하고 빌드합니다.

## 주의 사항
- 주의: JDK13 라이브러리를 추가해야 할 수 있습니다.
- 주의: SSH에 대한 jsch-0.1.55.jar를 추가해야 할 수 있습니다.


NetBeans → 프로젝트에서 오른쪽 클릭 → 속성 → 라이브러리 → 라이브러리 추가.

# Software Interface 소프트웨어 인터페이스
## Password Authentication "admin" or "admin1" - 비밀번호 인증 "admin" 또는 "admin1"
![image](https://github.com/zenith85/Remote-SBC-ARM-Cortex-A7-processor-controller/assets/25374965/2f916b67-63f3-45cb-9002-7d84b94998bb)
## Main Interface Channel controllers - 메인 인터페이스 채널 컨트롤러
![image](https://github.com/zenith85/Remote-SBC-ARM-Cortex-A7-processor-controller/assets/25374965/11c79dc6-4e6b-44a2-8dc5-4508527ff7f1)
## Destination SBC IP address settings - 대상 SBC IP 주소 설정
![image](https://github.com/zenith85/Remote-SBC-ARM-Cortex-A7-processor-controller/assets/25374965/d739f4c5-5e13-4c46-a5ee-1bed9663f410)
## Password and security changing panel - 비밀번호 및 보안 변경 패널
![image](https://github.com/zenith85/Remote-SBC-ARM-Cortex-A7-processor-controller/assets/25374965/2a6d6f39-7c86-4279-9717-aef65914f925)



    
