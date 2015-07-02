# 简介
---

`server-api` 是一个GUI的WEB接口管理工具，基于 [swagger-ui](https://github.com/swagger-api/swagger-ui) 的后台API开源项目，采用SpringMvc+Maven3+Jdk1.7+Tomcat7,该项目的初衷是为了更好的去发展Swagger-ui与SpringMvc的结合，希望能够更加灵活，轻量化的根据后台不同的数据源展示出不同接口文档，满足日益增长的接口文档需求，这里包括（接口文档的格式，权限，视图，Mock数据，Api监控,自动化测试,接口文档分享，版本管理等），`server-api` 可以帮助后台开发人员解放双手，直接用注解生成文档，省去与前端、测试的沟通，以及项目上线后问题的监控和排查。

# 特色
---
- 完美支持spring,采用注解编写文档
- 免费的技术支持

# 部署
## 准备工作
- Eclipse/MyEclipse/IDEA
- JDK1.7+
- Tomcat7.*+
- Git
- Maven3插件

## 构建项目
### 获取源代码
```
git clone git@github.com:mousycoder/server-api.git
git checkout release
```

确保您正确的切换到release分支。

### 导入到IDE
以Eclipse为例，在File->Import->Existing Maven Projects,将server-api项目导入进来。


### 启动项目
- `maven install`
- 打包后的war包部署到tomcat中启动即可。


# 技术支持
---
- Issues(推荐):[提交您的Issue](https://github.com/mousycoder/server-api/issues)
- QQ技术支持群： <a target="_blank" href="http://shang.qq.com/wpa/qunwpa?idkey=1ee1e533b44ef916dd09742b52472317a54eb00880127d4f4c6f1ec06e4397e3"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="Java 交流群" title="Java 交流群"> 70812183</a>
- 个人博客:[@mousycoder](http://huhao520.com)

# 让我们一起为后台接口文档，做出一份努力吧！








