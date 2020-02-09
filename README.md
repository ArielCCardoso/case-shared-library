# Shared Libraries 

Repositório de Shared Libraries.

## Estrutura
```
(root)
+- src                                   # Groovy source files
|   +- foo
|       +- bar
|             +- pipeline
|                 +- Bar.groovy         # foo.bar.pipeline.Bar class
+- vars
|   +- foo.groovy                        # for global 'foo' variable
|   +- foo.txt                           # help for 'foo' variable
+- resources                             # resource files (external libraries only)
|   +- settings
|       +- mvn-settings.xml              # maven settings file
|       +- mvn-settings-security.xml     # maven settings security file
|   +- etc-example
|       +- etc-files
|   +- other-files.json

```

## Referências:
- https://jenkins.io/doc/book/pipeline/shared-libraries/
- https://jenkins.io/doc/pipeline/steps/
- https://jenkins.io/blog/2017/10/02/pipeline-templates-with-shared-libraries/
- http://tdongsi.github.io/blog/2017/12/26/class-in-jenkins-shared-library/
- https://jenkins.io/blog/2017/06/27/speaker-blog-SAS-jenkins-world/
- https://stackoverflow.com/questions/44024245/how-do-i-write-a-jenkins-pipeline-function-in-order-to-be-able-to-use-it-as-an-o