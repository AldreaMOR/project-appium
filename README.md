# project-appium
Project for QA Automation native app using appium - Android and iOS

--------------
Projeto com Appium e Selenium simulando testes para Android no Windows:

Tools:
- Node JS
- Java JDK Open Source - https://jdk.java.net/17/
- Appium Inspector. Baixar o .exe/.dmg em https://github.com/appium/appium-inspector/releases
- Appium CLI 10.0.0. Comando no terminal para instalação ~ npm install -g appium
- Android Studio. Baixar o .exe/.dmg em https://developer.android.com/studio?hl=pt-br
- Apk para teste (aplicação de exemplo)
- Instalar o driver uiautomator para usar o servidor do appium junto com o emulador do Android Studio. Comando no terminal ~ appium driver install uiautomator2

Passos:
- Abrir o Android Studio e iniciar o emulador de um dispositivo configurado. Ao iniciar, o emulador do dispositivo será apresentado.
- Iniciar o Appium CLI, indo no terminal e executando o comando ~ appium. Ao executar, a aplicação do appium fica iniciado, para escutar toda a interação com o Appium Inspector e o aplicativo.
- Abrir o Appium Inspector e iniciar a configuração de um emulador de dispositivo do Android com a apk salvo na máquina. Ao iniciar, será apresentado todas as interações para ser inspecionada do aplicativo no dispositivo.

Notas:
- Para saber quais os dispositivos existentes conectados ao PC no momento, digite o comando no terminal ~ adb devices
  Essa informação serve para capturar o udid que pode ser adicionado como um dos valores da configuração a ser adicionado no Appium Inspector e no código.
- Para saber se há drivers mais recentes para uso do servidor do appium usar o comando no terminal ~ appium driver list --updates


--------------