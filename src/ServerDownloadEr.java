import java.io.IOException;
import java.util.Scanner;
//����

public class ServerDownloadEr {
    //Main������,��������
    public static void main(String[] args) {
        System.out.println("�����������  ����:��������@7777a2333");
        System.out.println("��Դ��ַ:github.com/7777a2333/ServerDownloadEr");
        System.out.println("����GNU GPLv3Э��ַ�,�����и�������");
        System.out.println("ԭ������ʹ����mcjars.com��ת��Mojang������");
        System.out.println("CraftBukkit��Spigotʹ����Getbukkit����������");
        //��ʾ����
        System.out.println("-----------------�����֧�ְ汾-----------------");
        System.out.println("ԭ������:         :ȫ�汾 �������֧������1.2.5������(��������)");
        System.out.println("Purpur�����       :1.14.1������");
        System.out.println("Spigot�����       :1.0.0������");
        System.out.println("CraftBukkit�����  :1.0.0������");

        System.out.println("---------------------------------------------");
        //��ʾ���������֧�ְ汾
        Scanner Ҫ������ = new Scanner(System.in);
        System.out.println("������Ҫ���صķ���˰汾��(����1.19.3 | 22w13a(������ԭ������))");
        String ����˰汾 = Ҫ������.next();
        //Ҫ���������˰汾,�����浽"����˰汾"String������
        System.out.println("������Ҫ���صķ����:(�����)");
        System.out.println("1   ԭ������   2 Purpur�����(Parper��֧)  3   Spigot�����   4 CarftBukkit�����");
        int ��������� = Ҫ������.nextInt();
        //Ҫ�������������,���ҷŽ�"���������"int������
        String �������������;
        String ���������;
        //��������
        if (��������� == 1) {
            //������������=1���д˴��Ĵ���(��ʼ)
            ������������� = "https://www.mcjars.com/get/vanilla-" + ����˰汾 + ".jar";
            ��������� = ����˰汾 + ".jar";
            //������������=1���д˴��Ĵ���(����)
        } else {
            if (��������� == 2) {
                //������������=2���д˴��Ĵ���(��ʼ)
                ������������� = "api.purpurmc.org/v2/purpur/" + ����˰汾 + "/latest/download";
                ��������� = "download";
                //������������=2���д˴��Ĵ���(����)
            } else {
                System.out.println("����˰汾�Ƿ�С�ڻ����1.16.5?(����true,����false)");
                boolean cdn = Ҫ������.nextBoolean();
                //Getbukkit�д���1.16.5(����)����������download.С��1.16.5����������cdn
                if (��������� == 3){
                    //������������=3���д˴��Ĵ���(��ʼ)
                    if (!cdn){
                        ������������� = "https://download.getbukkit.org/spigot/spigot-" + ����˰汾 + ".jar";
                    }else {
                        ������������� = "https://cdn.getbukkit.org/spigot/spigot-" + ����˰汾 + ".jar";
                    }
                    ��������� = "spigot-" + ����˰汾 + ".jar";
                    //������������=3���д˴��Ĵ���(����)
                }else{
                    //������������=4���д˴��Ĵ���(��ʼ)
                    if (!cdn){
                        ������������� = "https://download.getbukkit.org/craftbukkit/craftbukkit-" + ����˰汾 + ".jar";
                    }else {
                        ������������� = "https://cdn.getbukkit.org/craftbukkit/craftbukkit-" + ����˰汾 + ".jar";
                    }
                    ��������� = "craftbukkit-" + ����˰汾 + ".jar";
                    //������������=4���д˴��Ĵ���(����)
                }
            }

        }
        //�жϷ�������Ͳ����������ӷŵ�"�������������"����(�����е��������)(����ά����ը)
        try {
            Runtime.getRuntime().exec("cmd /k start ./wget.exe " + �������������);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //ʹ��Wget���ط����
        System.out.println("������ɺ�,����true���������,Ҳ���ڷ��������Ŀ¼��������java -jar " + ��������� + "���з����.");
        boolean Start = Ҫ������.nextBoolean();
        if (Start){
            try {
                Runtime.getRuntime().exec("cmd /k start java -jar " + ��������� );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.exit(233);
        }
    }
}
