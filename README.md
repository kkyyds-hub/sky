# Sky Takeout (苍穹外卖)

一个基于Spring Boot+MyBatis构建的外卖订餐全栈管理系统，清晰展示了企业级应用的分层架构、模块化设计及核心业务流程的实现。

## 🚀 技术栈与架构

### 后端技术
- **核心框架：** Spring Boot, Spring MVC, Spring AOP
- **数据持久化：** MyBatis
- **数据库：** MySQL
- **缓存与消息队列：** Redis
- **工具与组件：** Apache POI (Excel报表), Java Mail (邮件服务), WebSocket (实时通信)
- **项目构建：** Maven (多模块项目: `sky-common`, `sky-pojo`, `sky-server`)

### 前端技术
- 项目主要专注于后端架构，前端为配套的简易管理界面。

## ⚙️ 核心功能模块

### 用户端
- **身份验证：** 微信登录、手机号登录
- **菜品浏览：** 分类查询、菜品详情展示
- **购物车管理：** 添加、删除、修改数量
- **订单流程：** 下单、模拟支付、订单状态查询

### 管理端
- **菜品管理：** 新增、删除、修改、上下架
- **分类管理：** 菜品分类维护
- **订单管理：** 订单查询、接单、取消、派送
- **数据统计与导出：** 实现日/周/月销量统计，并支持将数据导出为Excel报表。

## 🗂️ 项目结构与设计理念

本项目采用标准的Maven多模块架构，职责分离清晰：
- **sky-common:** 公共模块，存放工具类、常量、通用配置、异常处理等。
- **sky-pojo:** 模型模块，统一管理实体类（Entity）、数据传输对象（DTO）等。
- **sky-server:** 核心业务模块，包含完整的Web应用代码。

### sky-server 模块核心目录说明
```
src/main/java/
├── com/sky/
│ ├── annotation/ # 自定义注解（如权限校验）
│ ├── aspect/ # 面向切面编程（AOP），用于统一逻辑处理
│ ├── config/ # 配置类（Web、Redis、MyBatis等）
│ ├── constant/ # 常量类
│ ├── controller/ # 控制层，Restful API接口
│ ├── converter/ # 数据转换器（DTO/VO/Entity转换）
│ ├── dto/ # 数据传输对象
│ ├── entity/ # 实体类
│ ├── exception/ # 自定义异常处理
│ ├── filter/ # 过滤器
│ ├── interceptor/ # 拦截器（如登录校验）
│ ├── listener/ # 应用监听器
│ ├── mapper/ # 数据持久层（MyBatis Mapper接口）
│ ├── properties/ # 自定义配置属性类（如阿里云OSS配置）
│ ├── service/ # 业务逻辑层接口
│ │ └── impl/ # 业务逻辑层实现类
│ ├── task/ # 定时任务
│ └── websocket/ # WebSocket全双工通信
```
## 🛠️ 快速开始

### 环境准备
- JDK 1.8+
- Maven 3.6+
- MySQL 5.7+
- Redis 3.2+

### 部署步骤
1.  **克隆项目**
 ```
bash
git clone https://github.com/[你的GitHub用户名]/sky-takeout.git
```
3.  **数据库初始化**
- 在MySQL中创建名为 `sky_takeout` 的数据库。
- 请根据实体类定义或项目文档手动创建数据表结构。
3.  **配置修改**
- 打开 `src/main/resources/application.yml`，根据你的本地环境修改MySQL和Redis的连接信息。
4.  **启动项目**
- 使用IDE运行 `SkyTakeoutApplication.java` 主类。
- 或使用Maven命令：`mvn spring-boot:run`。

## ✨ 项目亮点与技术总结

1.  **规范的多模块架构：** 采用Maven将项目拆分为common、pojo、server模块，体现了高内聚低耦合的设计思想，极大提升了代码的可维护性。
2.  **清晰的分层与封装：**
- 严格遵循MVC分层，并引入了DTO/VO进行前后端数据隔离。
- 使用`converter`层专责对象转换，职责单一。
3.  **企业级通用能力实现：**
- **权限控制：** 通过自定义`注解`+`拦截器`实现精细化的接口访问权限管理。
- **统一处理：** 利用`AOP`（切面）和`异常处理器`管理通用逻辑（如日志、性能监控），保证代码健壮性。
- **实时通信：** 集成`WebSocket`实现订单状态等信息的实时推送。
- **异步任务：** 使用`定时任务`处理后台作业（如数据报表）。
4.  **工程化实践：** 熟练运用`Redis`缓存、`Apache POI`处理报表、`阿里云OSS`进行文件存储，展现了解决复杂业务场景的能力。

---

**欢迎Star和Fork！如果对这个项目有任何问题，欢迎联系我。**
