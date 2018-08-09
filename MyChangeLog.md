### 修改日志

记录在该项目上的提交，本文件的修改不计入在内。

> 基于以下版本修改：
>
> **GitVersion**  36626e4d819c30da8e281594758559ec13f00679
>
> **MavenVersion**  1.6.5-BETA
>
> **GitUrl**  https://github.com/MyCATApache/Mycat-Server.git

- 2018-5-17 `0e9cb6f20459dcf2491c51958ea50a06b1091199` 添加了根据字符子串取模计算分区号的分片算法[PartitionDirectBySubStringMod](https://github.com/Sunxiai51/Mycat-Server/blob/0e9cb6f20459dcf2491c51958ea50a06b1091199/src/main/java/io/mycat/route/function/PartitionDirectBySubStringMod.java)
- 2018-5-21 `c35a8c6dd83cee54f94fca7d2e152a602350db3e` 上传了ewallet分表配置的配置文件

- 2018-8-9 `81c18416fa1a8e416e90ff5f141c64ac10328206` 修复 [MultiNodeCoordinator#](https://github.com/Sunxiai51/Mycat-Server/blob/81c18416fa1a8e416e90ff5f141c64ac10328206/src/main/java/io/mycat/backend/mysql/nio/handler/MultiNodeCoordinator.java) okResponse(byte[] ok, BackendConnection conn)中coordinatorLogEntry可能为空的bug


