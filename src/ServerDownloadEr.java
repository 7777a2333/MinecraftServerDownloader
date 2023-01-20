import java.io.IOException;
import java.util.Scanner;
//导包

@SuppressWarnings("ALL")
public class ServerDownloadEr {
    //Main主方法,程序的入口
    public static void main(String[] args) {
        版本();
        //显示版本

        System.out.println("---------------------------------------------");

        说明();
        //调用"说明"方法 显示说明


        Scanner 要求输入 = new Scanner(System.in);
        //新建Scanner命名为"要求输入"

        String 服务端版本 = null;
        String 服务端下载链接 = null;
        String 服务端名称 = null;
        //初始化变量为null
        System.out.println("----------------------------------------------");
        System.out.println("输入你要下载的服务端:(填序号)");
        System.out.println("1   原版服务端   2 Purpur服务端(Paper分支)  3   Spigot服务端   4 CraftBukkit服务端");
        int 服务端类型 = 要求输入.nextInt();
        //要求输入服务端序号,并且放进"服务端类型"int变量内
        if (服务端类型 == 1) {

            System.out.println("输入要下载的服务端版本号(1.2.5及以上)(支持快照13w16a以上)");
            服务端版本 = 要求输入.next();
            //要求输入服务端版本,并保存到服务端版本变量内

            System.out.println("选择你要使用的镜像源:(填序号)");
            System.out.println("1 Mojang源 2 BMCLAPI源 3 MCBBS源");
            int 下载源 = 要求输入.nextInt();
            //要求输入下载源编号

            if (下载源 == 1){
                服务端下载链接 = "https://www.mcjars.com/get/vanilla-" + 服务端版本 + ".jar";
                服务端名称 = 服务端版本 + ".jar";
                //官方源
            } else {
                if (下载源 == 2){
                    服务端下载链接 = "https://bmclapi2.bangbang93.com/version/" + 服务端版本 + "/server";
                    //BMCLAPI源
                }else {
                    服务端下载链接 = "https://download.mcbbs.net/version/" + 服务端版本 + "/server";
                    //MCBBS源
                }
                服务端名称 = "server";
            }

        } else {
            if (服务端类型 == 2) {

                System.out.println("输入要下载的服务端版本号(1.14.4及以上)");
                服务端版本 = 要求输入.next();
                //要求输入服务端版本,并保存到服务端版本变量内

                服务端下载链接 = "https://api.purpurmc.org/v2/purpur/" + 服务端版本 + "/latest/download";
                服务端名称 = "download";
            } else {
                System.out.println("输入要下载的服务端版本号(1.0.0及以上)");
                服务端版本 = 要求输入.next();
                //要求输入服务端版本,并保存到服务端版本变量内

                System.out.println("服务端版本是否小于或等于1.16.5?(是填true,否填false)");
                boolean cdn = 要求输入.nextBoolean();
                //Getbukkit中大于1.16.5(包括)二级域名是download.小于1.16.5二级域名是cdn

                if (服务端类型 == 3){

                    //如果服务端类型=3运行此处的代码(开始)
                    if (!cdn){
                        服务端下载链接 = "https://download.getbukkit.org/spigot/spigot-" + 服务端版本 + ".jar";
                    }else {
                        服务端下载链接 = "https://cdn.getbukkit.org/spigot/spigot-" + 服务端版本 + ".jar";
                    }
                    服务端名称 = "spigot-" + 服务端版本 + ".jar";
                    //如果服务端类型=3运行此处的代码(结束)
                }else{
                    if (!cdn){
                        服务端下载链接 = "https://download.getbukkit.org/craftbukkit/craftbukkit-" + 服务端版本 + ".jar";
                    }else {
                        服务端下载链接 = "https://cdn.getbukkit.org/craftbukkit/craftbukkit-" + 服务端版本 + ".jar";
                    }
                    服务端名称 = "craftbukkit-" + 服务端版本 + ".jar";
                }
            }

        }
        //判断服务端类型并将下载链接放到"服务端下载链接"变量(方法有点蠢别在意)(后期维护爆炸)

        try {
            Runtime.getRuntime().exec("cmd /k start ./wget.exe " + 服务端下载链接);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //使用Wget下载服务端

        System.out.println("下载完成后,输入true启动服务端,也可在服务端所在目录运行命令java -jar " + 服务端名称 + "运行服务端.");
        //显示输入true启动的说明

        boolean Start = 要求输入.nextBoolean();
        if (Start){
            try {
                Runtime.getRuntime().exec("cmd /k start java -jar " + 服务端名称 );
            } catch (IOException e) {
                throw new RuntimeException(e);
                //启动服务端的代码
            }
        }else{
            System.exit(233);
            //退出的代码
        }
    }


    public static void 说明() {
        System.out.println("服务端下载器  作者:哔哩哔哩@7777a2333");
        System.out.println("开源地址:https://github.com/7777a2333/MinecraftServerDownloader");
        System.out.println("采用GNU GPLv3协议分发,并含有附加条款");
        System.out.println("原版服务端Mojang源使用了mcjars.com跳转至Mojang服务器");
        System.out.println("原版服务端国内源由BMCLAPI和MCBBS提供高速下载服务.BMCLAPI为公益服务.赞助BMCLAPI可以帮助作者提供更好的高速下载服务");
        System.out.println("赞助BMCLAPI:https://afdian.net/a/bangbang93");
        System.out.println("CraftBukkit和Spigot使用了Getbukkit服务器下载");
        //显示关于
    }
    public static void 版本(){
        System.out.println("版本:1.5.0\n" +
                "编译时间: 2022/1/20 11:16");
    }
}
