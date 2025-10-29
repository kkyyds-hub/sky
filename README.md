# Sky Takeout (苍穹外卖)

一个基于Spring Boot+MyBatis的外卖订餐全栈后台管理系统，涵盖了用户端下单与管理员端管理的核心业务流程。

## 🚀 技术栈

### 后端
- **核心框架：** Spring Boot, Spring MVC
- **ORM框架：** MyBatis, MyBatis Plus
- **数据库：** MySQL
- **缓存：** Redis
- **项目构建：** Maven
- **API测试：** Postman

### 前端
- 【例如：H5, Vue.js, Element UI / 或者写：项目主要专注于后端，前端为配套简易管理界面】

## ⚙️ 核心功能模块

### 用户端
- **身份验证：** 微信登录、手机号登录
- **菜品浏览：** 分类查询、菜品详情
- **购物车管理：** 添加、删除、修改数量
- **订单流程：** 下单、模拟支付、订单状态查询

### 管理端
- **菜品管理：** 新增、删除、修改、上下架
- **分类管理：** 菜品分类维护
- **订单管理：** 订单查询、接单、取消、派送
- **数据统计：** 【如果有的话，可以写上】

## 🗂️ 项目结构
'''
项目结构

src/main/java
├── controller      # 控制层，接收请求
├── service         # 业务逻辑层
│   └── impl       # 业务逻辑实现类
├── mapper          # 数据持久层 (MyBatis Mapper接口)
├── entity          # 实体类 (与数据库表对应)
├── dto             # 数据传输对象
└── config          # 配置类
resources/
├── application.yml # 主配置文件
└── mapper/         # MyBatis XML映射文件
'''
## 🛠️ 快速开始

### 环境准备
1.  JDK 【你的JDK版本，如：1.8】
2.  Maven 【你的Maven版本，如：3.6.3】
3.  MySQL 【你的MySQL版本，如：5.7】
4.  Redis 【你的Redis版本，如：5.0】

### 部署步骤
1.  **克隆项目**
2.  **初始化数据库**
- 在MySQL中创建名为 `sky_takeout` 的数据库。
- 运行项目sql目录下的初始化脚本 `【你的SQL脚本文件，如：sky_takeout.sql】`。
3.  **配置修改**
- 打开 `src/main/resources/application.yml`，根据你的本地环境修改MySQL和Redis的连接信息（用户名、密码、端口）。
4.  **启动项目**
- 使用IDE运行 `SkyTakeoutApplication.java` 主类。
- 或使用Maven命令：`mvn spring-boot:run`。

## ✨ 项目亮点

- 采用**MVC分层架构**，代码结构清晰，易于维护。
- 使用**Redis缓存**提升热点数据（如菜品分类）的查询速度。
- 通过**AOP**或**拦截器**实现通用的登录状态校验。
- 通过此项目，我系统掌握了从0到1搭建一个Spring Boot企业级应用的完整流程。

---

**欢迎Star和Fork！如果对这个项目有任何问题，欢迎联系我。**
