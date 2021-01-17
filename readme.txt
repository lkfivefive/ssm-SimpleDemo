SSM整合实现步骤：
（1）新建maven web项目
（2）加入依赖：springmvc,spring,mybatis,jackson,druid连接池,jsp,servlet依赖
（3）写web.xml：
    1）注册DispatcherServlet：创建springmvc容器对象创建Controller类，创建Servlet接收用户的请求
    2）注册spring的监听器ContextLoaderListener：创建spring的容器对象来创建service，dao对象
    3）注册字符集过滤器，解决post请求乱码的问题
（4）创建包，Controller包，service，dao，实体类包
（5）写springmvc配置文件，spring配置文件，mybatis配置文件
（6）写代码，dao接口和mapper文件，service和实现类，controller，实体类
（7）写jsp页面
