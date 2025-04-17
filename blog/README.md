# 博客系统搭建

作为一个程序员，我一直想拥有一个自己的博客，在大学的时候，出于技术能力不足的原因，只能使用一些开源的博客系统，例如hexo，可惜这些系统使用繁琐，并且我只是想将博客作为知识库存储，并没有很强的分享欲望，所以渐渐放弃了。

趁闲暇之余，我重写了博客系统，出于效率考虑，很多地方都没达到完美的状态，但对我而言已经足够了，后续的功能再慢慢补充，现在来补充一下心得体会。



后端搭建：

博客后端业务并不复杂，主要实现博客的存储与查询，以及一些网站信息的保存，所以使用了单体架构

开发语言使用Java，使用了[Spring Boot](https://spring.io/projects/spring-boot/)框架，顺便学习Spring Boot3与Spring Boot2的区别，jdk使用了Java17

数据库方面持久化使用了[MySQL](https://www.mysql.com/cn/)，orm框架使用了[mybatis-plus](https://baomidou.com/)，也算是后端常见搭配了

安全框架使用了[sa-token](https://sa-token.cc/)，使用体验比[Spring Security](https://spring.io/projects/spring-security)和[Shiro](https://shiro.apache.org/)要方便一些

博客的存储使用了[commonmark](https://commonmark.org/)，它可以将markdown语法解析为html格式，在前端进行展示

系统主要实现了博客管理和网站管理，用于保存和发表博客



前端搭建：

博客前端使用了[vite](https://cn.vitejs.dev/)编译开发，相较于[webpack](https://www.webpackjs.com/)的厚重，vite的编译速度飞快

同时使用[vue3](https://cn.vuejs.org/)语法，setup确实自由，但是没有vue2的约束，显得没有章法，更适合个人开发而非团队

博客管理使用了一个后端开发模板，暂时没有精力去优化页面，能跑就行

后端的富文本组件使用了[mavon-editor](https://hinesboy.github.io/mavonEditor/)，相较于需要自定义组件的富文本，还是喜欢懒人开箱即用的

博客展示使用了新的组件库[fomantic-ui](https://fomantic-ui.com/)，和[element-plus](https://element-plus.org/zh-CN/)不同，使用通过class来改变组件样式，使用较为复杂，但是效果还是挺好看的，就是颜色有些暗淡



​	

