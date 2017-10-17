# SpringMVC

[mvnrepository](http://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.9.1)

[SpringBoot](http://tengj.top/2017/02/26/springboot1/)

###初始化应用
```
1.打开 Eclipse，接下来我们就开始创建自己的 Web 项目，点击"File"->"New"->"Maven project".
2.点击"Next"，注意接下来选择的"Archetype"，咱们是 Web 项目，所以一定要选择"maven-archetype-webapp".
3.点击"Next"，填写 Group Id 和 Artifact Id，然后在点击"Finish".
4.项目构建完成
5.建立一下源码目录，在 src->main 下面新建一个文件夹 java。
  这里还有一个注意的地方，建立好新的 maven 项目之后，可能需要一些简单的配置，一是 Servlet 版本，一  是 JDK 版本，以及项目结构。
  5.1改下 JDK，点击项目右键 ->proerties->java compile，将 JDK 版本调整为 1.7 以上以匹配线上版本。
  5.2在修改下项目的结构，点击 Project Facet，修改下 Java 的版本和刚刚修改的版本一致。
  5.3修改下 Dynamic Web Module，改成 3.1 版本（如果点击下面提示无法改变版本的话，就先反选 Dynamic Web Module 然后确定，
     在重新进入这个界面在勾选即可修改）
  5.4配置一下 Web 目录，将Content directory更改为src/main/webapp
  
6.配置pom.xml
7.配置web.xml
8.配置springmvc-config.xml
  
```

###
```
```
