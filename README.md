# parseXml2Ini
用于解析ini格式的xml字符；配合twoArray双层键值数组使用；

## Mian文件
测试文件；

## twoArray文件
双层键值数组结构类型；<br>
基类型为List;<br>
并提供了以键或键组查找功能；

## parseXml文件
解析ini格式的Xml文件为twoArray类型数据

## ini格式Xml文件解释
形同键值对；但最多可有一个组<br>
例：<br>
return=false<br>
[info]<br>
id=fc404<br>
age=20<br>
上例为基本的ini配置文件格式<br>
\<return\>false\</return\><br>
\<info\><br>
\<id\>fc404\</id\><br>
\<age\>20\</age\><br>
\</info\><br>
