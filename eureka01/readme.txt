注册中心的高可用配置
在resource中新加两个配置文件
application-peer1.properties
application-peer2.properties

修改hosts文件
添加
127.0.0.1 peer1
127.0.0.1 peer2

启动时需要配置启动参数
java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer1
java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer2

