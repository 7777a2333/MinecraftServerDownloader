import java.io.IOException;
import java.util.Scanner;
//导包

public class ServerDownloadEr {
    //Main主方法,程序的入口
    public static void main(String[] args) {
        System.out.println("服务端下载器  作者:哔哩哔哩@7777a2333");
        System.out.println("开源地址:github.com/7777a2333/ServerDownloadEr");
        System.out.println("采用GNU GPLv3协议分发,并含有附加条款");
        System.out.println("原版服务端使用了mcjars.com跳转至Mojang服务器");
        System.out.println("CraftBukkit和Spigot使用了Getbukkit服务器下载");
        //显示关于
        System.out.println("-----------------服务端支持版本-----------------");
        System.out.println("原版服务端:         :全版本 本程序仅支持下载1.2.5及以上(包括快照)");
        System.out.println("Purpur服务端       :1.14.1及以上");
        System.out.println("Spigot服务端       :1.0.0及以上");
        System.out.println("CraftBukkit服务端  :1.0.0及以上");

        System.out.println("---------------------------------------------");
        //显示各个服务端支持版本
        Scanner 要求输入 = new Scanner(System.in);
        System.out.println("输入你要下载的服务端版本号(例如1.19.3 | 22w13a(仅快照原版服务端))");
        String 服务端版本 = 要求输入.next();
        //要求输入服务端版本,并保存到"服务端版本"String变量内
        System.out.println("输入你要下载的服务端:(填序号)");
        System.out.println("1   原版服务端   2 Purpur服务端(Parper分支)  3   Spigot服务端   4 CarftBukkit服务端");
        int 服务端类型 = 要求输入.nextInt();
        //要求输入服务端序号,并且放进"服务端类型"int变量内
        String 服务端下载链接;
        String 服务端名称;
        //声明变量
        if (服务端类型 == 1) {
            //如果服务端类型=1运行此处的代码(开始)
            服务端下载链接 = "https://www.mcjars.com/get/vanilla-" + 服务端版本 + ".jar";
            服务端名称 = 服务端版本 + ".jar";
            //如果服务端类型=1运行此处的代码(结束)
        } else {
            if (服务端类型 == 2) {
                //如果服务端类型=2运行此处的代码(开始)
                服务端下载链接 = "api.purpurmc.org/v2/purpur/" + 服务端版本 + "/latest/download";
                服务端名称 = "download";
                //如果服务端类型=2运行此处的代码(结束)
            } else {
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
                    //如果服务端类型=4运行此处的代码(开始)
                    if (!cdn){
                        服务端下载链接 = "https://download.getbukkit.org/craftbukkit/craftbukkit-" + 服务端版本 + ".jar";
                    }else {
                        服务端下载链接 = "https://cdn.getbukkit.org/craftbukkit/craftbukkit-" + 服务端版本 + ".jar";
                    }
                    服务端名称 = "craftbukkit-" + 服务端版本 + ".jar";
                    //如果服务端类型=4运行此处的代码(结束)
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
        boolean Start = 要求输入.nextBoolean();
        if (Start){
            try {
                Runtime.getRuntime().exec("cmd /k start java -jar " + 服务端名称 );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.exit(233);
        }
    }
}
