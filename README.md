###Spring Boot框架从入门到实战


####1.初始化一个SpringBoot框架
![初始化项目图片](src/main/resources/rec/1.png)

####2.启动时：本地端口占用报错
  如果出现本地端口占用的情况，请cmd，然后使用如下命令
  netstat -ano|findstr 8080  【后面这个4188为端口pid,下面输入4188杀死即可】
  taskkill /f /t /im 4188    【4188为pid号】

####3.读取配置文件数据



####4.集成Swagger
访问地址：http://localhost:8080/swagger-ui.html