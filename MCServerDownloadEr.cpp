#include <cstring>
#include <iostream>
using namespace std;



int main(void)
//Main方法
{
    printf("服务端下载器(C++) v1.0.0  \n");
    printf("开源地址:https://github.com/7777a2333/MinecraftServerDownloader \n");
    printf("采用GNU GPLv3协议分发,并含有附加条款 \n");
    printf("原版服务端Mojang源使用了mcjars.com跳转至Mojang服务器 \n");
    printf("原版服务端国内源由BMCLAPI和MCBBS提供高速下载服务.BMCLAPI为公益服务.赞助BMCLAPI可以帮助作者提供更好的高速下载服务 \n");
    printf("赞助BMCLAPI:https://afdian.net/a/bangbang93 \n");
    printf("CraftBukkit和Spigot使用了Getbukkit服务器下载 \n");
    printf("远古版本来自betacraft.uk 其他均由官方源下载(详见Github) \n");
    //显示关于

    printf("-------------------------------------------------------------\n");

    string 服务端版本, 服务端下载链接, 服务端文件名称, 远古服务端大版本;
    int 服务端类型;
    //声明变量
    //初始化变量

    printf("输入你要下载的服务端:(填序号)\n");
    printf("1   原版服务端   2 Purpur服务端(Paper分支)  3    Spigot服务端   4 CraftBukkit服务端 \n");
    printf("5   MohistMC服务端   6 Fabric服务端            7    原版服务端(远古版本)\n");

    scanf_s("%d", &服务端类型);
    //要求输入服务端类型

    switch (服务端类型)
    {

    case 1:
        printf("你选择了原版服务端:\n");
        printf("输入要下载的服务端版本号(1.2.5及以上)(支持快照13w16a以上)\n");
        scanf_s("%s", &服务端版本 , 16);
        服务端下载链接 = "https://www.mcjars.com/get/vanilla-" + 服务端版本 + ".jar";
        break;

    case 2:
        printf("你选择了Purpur服务端:\n");

        break;

    case 3:
        printf("你选择了Spigot服务端:\n");

        break;

    case 4:
        printf("你选择了CraftBukkit服务端:\n");


        break;

    case 5:
        printf("你选择了MohistMC服务端:\n");


        break;

    case 6:
        printf("你选择了Fabric服务端:\n");


        break;

    case 7:
        printf("你选择了原版服务端(远古版本):\n");


        break;



    default:
        printf("输入有误.");
        exit(1);
    }
    //判断并将服务端下载链接存入"服务端下载链接"内

}
