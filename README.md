# C2MtestTask2 FIX

Тестовое задание 2
Задание для тестировщика 2 задание:

1. UI java selenide 
исользовать ооп
2 браузера chrome/firefox 
последовательность действий
открыть браузер-> ввести "свое имя фамилию" ->  открыть табу 'images' -> кликнуть н 3 картинку - > справа скачать картинку  себе в репозиторий

Сразу скажу, что задание я выполнил не совсем так.

"Тесты" находятся в классах TestChrome.java и TestFirefox.java по пути /src/test/java 
ссылка на тесты (https://github.com/Art3m311/C2MtestTask2/tree/master/src/test/java)
TestChrome - https://github.com/Art3m311/C2MtestTask2/blob/master/src/test/java/TestChrome.java
TestFireFox - https://github.com/Art3m311/C2MtestTask2/blob/master/src/test/java/TestFirefox.java


Загруженные картинки находятся по пути /src/test/downloadedImages
ссылка на папку с картинками (https://github.com/Art3m311/C2MtestTask2/tree/master/src/test/downloadedImages)

FIX
описание задачи: 
1. Maven добавить в проект
2. Запустить свой тест через maven 
3. Использовать testNG вместе unit
4. Передать параметры mvn “browser” chrome /  и в зависимости от браузера запускается разные
-----------------------------------------------------------------------------------------------------------
1) Убраны лишние классы
2) Передача параметра браузера через maven
3) Для теста используется фреймворк TestNG
4) Вся логика выбора теперь инициализации браузера теперь в одном классе TestBase
