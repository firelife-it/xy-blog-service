后端

<hr/>

模块划分：

> **xy-blog-dependency**
- 统一依赖
  - SpringBoot 最新版
  - mybatis最新版
  - mysql 8
  - pager helper
  - mybatis-mapper 快速开发
  - lombok
  - apache-common
  - fastjson
  - log4j(logback)
  - pdf

> **xy-blog-common**
- 公共

> **xy-blog-core**
- 框架核心

  > 定制一些特有的功能，以便快速开发
  - 。。。

> **xy-blog-user**
- 用户管理
  - 属性字典
  - 用户模板
  - 。。。

> **xy-blog-article**
- 文章
  - 编辑
  - 发布
    - 原创、转载
    - 是否允许评论
- 文章管理
  - 分类
  - 标签
  - 导入（md）
  - 导出（pdf和md）

> **xy-blog-comment**
- 评论
  - 文章评论
  - 开发者工具评论
- 点赞
- 踩

> **xy-blog-developer-tools**
- 开发者工具
  - 支持上传和下载日常常用开发工具
  - 根据文件名字检索

> **xy-blog-security**
- 权限管理
  - 登录
  - 注册
  - 接口权限控制
  - 。。。

> **xy-blog-log**
- 日志
  - 用户日志
  - 系统日志

> **xy-blog-management**
- 博客管理
  - OSS地址配置
  - 用户属性字典配置
  - 用户模板配置
  - 评论管理
    - 根据文章分类，是否开启评论。
    - 根据具体文章，是否允许评论。
    
- **xy-blog-registry-center**
   - 服务注册中心
