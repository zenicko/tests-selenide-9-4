#I'm a readme file and will tell about the project!
This project is next step studying selenide. 
___
## About home tasks ###

1. Есть ли разница между $("h1 div"); и $("h1").$("div"); 
   - может ли привести к тому что, поиск найдёт разные элементы? Если может - приведите пример, когда.
     static SelenideElement 	
   
   $(java.lang.String cssSelector)

     Locates the first element matching given CSS selector (lazy evaluation)
   find(String) - Method in class com.codeborne.selenide.SelenideDriver
   
find(String) - Method in interface com.codeborne.selenide.SelenideElement
   Locates the first matching element inside given element

$(java.lang.String cssSelector)
Same as find(String)

$("h1 div") будет искать первое совпадение `<h1>` с дочерними или поддочерними `<div>`.
$("h1").$("div") будет искать первый `<h1>`, затем  в нем  первый элемент `<div>`.
Результаты поиска могут отличаться Пример:
<body>
<h1 id="h-1">
    <a />
</h1>
<h1  id="h-2">
    <div id="div-1">
    <a/>
    </div>
    <h1  id="h-3">
    <a/>
    </h1>
</h1>
</body>

$("h1 div") => <div id="div-1">
$("h1").$("div")=> null





2. Разработайте следующий автотест:

   - Откройте страницу Selenide в Github

   - Перейдите в раздел Wiki проекта

   - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions

   - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

3. (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()

   - Откройте https://the-internet.herokuapp.com/drag_and_drop

   - Перенесите прямоугольник А на место В

   - Проверьте, что прямоугольники действительно поменялись

P.S. В Selenide есть команда $(element).dragAndDrop($(to-element)), 
проверьте работает ли тест, если использовать её вместо actions() 
(раньше не работала из-за ошибки в ChromeDriver, но может быть уже починили? :-)).
Если работает - сообщите в группе курса.

___
##Steps (commits) of the project.
Step 1. Create files: readme.md, build.gradle and .gitignore.

Step 2. Create a package of the project: src/test/java/ru.zenicko 

Step 3. The file build.gradle is added new instances. See *2.Gradle*

Step 4. Create `class SearchSelenideRepo.java`: doing part 2 home task.

Step 5. Create `class HerokuApp.java`: doing part 3 home task.
___
## What's new

###1. Java
###2. Gradle
   1. Language localisation

      `test {system.Property "chromeoptions.pref","intl.accept_languages=ru"}`

   2. Encoding

      `compileTestJava {options.encoding = 'UTF-8'}`
   3. Version of java 11

      `java{toolchain {languageVersion = JavaLanguageVersion.of(11)}}`
###3. Selenide
   
###4. Git
###5. Resources
   1. https://en.wikipedia.org/wiki/Java_version_history
   2. [Video about snippets](https://youtu.be/xxS8rfraDXs?t=9613 "Alexey Vinogradov time 02:40:13")
   3. 
###6. Miscellaneous
   1. MD. Lighting a part code: use ` (backtick)

        Example. Lorem `if`
   2. DevTools. Debugger.
      1. Sources -> F8 (Ctrl + \)
      2. Concole -> debugger -> Enter 
      3. `setTimeout(function(){debugger}, 4000);`
   3. opacity - непрозрачность, характеристика элемента (0 - прозрачен, 1 - непрозрачен)
   4. The code using Actions(): **unworked**

      @Test

      void dragAndDropActionsRectangles() {

      open("https://the-internet.herokuapp.com/drag_and_drop");

      int xb = $("#column-b").getLocation().x;

      int yb = $("#column-b").getLocation().y;

      System.out.println("Before");

      System.out.println($("#column-a").getLocation());

       System.out.println($("#column-a").getSize());

       System.out.println($("#column-b").getLocation());

       System.out.println($("#column-b").getSize());

       actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(215, 0).perform(); //.release()

       System.out.println("After");

       System.out.println($("#column-a").getLocation());

       System.out.println($("#column-a").getSize());

       System.out.println($("#column-b").getLocation());

       System.out.println($("#column-b").getSize());

       sleep(5000);

       }
___

##Checking





