import java.io.IOException;
import java.util.Scanner;
//����

public class ServerDownloadEr {
    //Main������,��������
    public static void main(String[] args) {
        �汾();
        //��ʾ�汾

        System.out.println("---------------------------------------------");

        ˵��();
        //����"˵��"���� ��ʾ˵��

        ��ʾ֧�ְ汾();
        //����"��ʾ֧�ְ汾"���� ��ʾ֧�ְ汾

        Scanner Ҫ������ = new Scanner(System.in);
        //�½�Scanner����Ϊ"Ҫ������"

        System.out.println("������Ҫ���صķ���˰汾��(����1.19.3 | 22w13a(������ԭ������))");
        String ����˰汾 = Ҫ������.next();
        //Ҫ���������˰汾,�����浽"����˰汾"String������

        System.out.println("������Ҫ���صķ����:(�����)");
        System.out.println("1   ԭ������   2 Purpur�����(Paper��֧)  3   Spigot�����   4 CraftBukkit�����");
        int ��������� = Ҫ������.nextInt();
        //Ҫ�������������,���ҷŽ�"���������"int������

        String ������������� = null;
        String ��������� = null;
        //��ʼ������Ϊnull

        if (��������� == 1) {
            //������������=1���д˴��Ĵ���(��ʼ)
            System.out.println("ѡ����Ҫʹ�õľ���Դ:(�����)");
            System.out.println("1 MojangԴ 2 BMCLAPIԴ 3 MCBBSԴ");
            int ����Դ = Ҫ������.nextInt();
            //Ҫ����������Դ���
            if (����Դ == 1){
                ������������� = "https://www.mcjars.com/get/vanilla-" + ����˰汾 + ".jar";
                ��������� = ����˰汾 + ".jar";
                //�ٷ�Դ
            } else {
                if (����Դ == 2){
                    ������������� = "https://bmclapi2.bangbang93.com/version/" + ����˰汾 + "/server";
                }else {
                    ������������� = "https://download.mcbbs.net/version/" + ����˰汾 + "/server";
                }
                ��������� = "server";
            }

            //������������=1���д˴��Ĵ���(����)
        } else {
            if (��������� == 2) {
                //������������=2���д˴��Ĵ���(��ʼ)
                ������������� = "https://api.purpurmc.org/v2/purpur/" + ����˰汾 + "/latest/download";
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
        //��ʾ����true������˵��

        boolean Start = Ҫ������.nextBoolean();
        if (Start){
            try {
                Runtime.getRuntime().exec("cmd /k start java -jar " + ��������� );
            } catch (IOException e) {
                throw new RuntimeException(e);
                //��������˵Ĵ���
            }
        }else{
            System.exit(233);
            //�˳��Ĵ���
        }
    }

    public static void ��ʾ֧�ְ汾() {
        System.out.println("-----------------�����֧�ְ汾-----------------");
        System.out.println("ԭ������:         :ȫ�汾 �������֧������1.2.5������(��������)");
        System.out.println("Purpur�����       :1.14.1������");
        System.out.println("Spigot�����       :1.0.0������");
        System.out.println("CraftBukkit�����  :1.0.0������");
        System.out.println("---------------------------------------------");
        //��ʾ���������֧�ְ汾
    }

    public static void ˵��() {
        System.out.println("�����������  ����:��������@7777a2333");
        System.out.println("��Դ��ַ:https://github.com/7777a2333/MinecraftServerDownloader");
        System.out.println("����GNU GPLv3Э��ַ�,�����и�������");
        System.out.println("ԭ������MojangԴʹ����mcjars.com��ת��Mojang������");
        System.out.println("ԭ�����˹���Դ��BMCLAPI��MCBBS�ṩ�������ط���.BMCLAPIΪ�������.����BMCLAPI���԰��������ṩ���õĸ������ط���");
        System.out.println("����BMCLAPI:https://afdian.net/a/bangbang93");
        System.out.println("CraftBukkit��Spigotʹ����Getbukkit����������");
        //��ʾ����
    }
    public static void �汾(){
        System.out.println("�汾:1.4.1\n" +
                "����ʱ��: 2022/1/19 22:15");
    }
}
