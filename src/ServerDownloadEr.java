import java.io.IOException;
import java.util.Scanner;
//����

@SuppressWarnings("ALL")
public class ServerDownloadEr {
    //Main������,��������
    public static void main(String[] args) {
        �汾();
        //��ʾ�汾

        System.out.println("---------------------------------------------");

        ˵��();
        //����"˵��"���� ��ʾ˵��


        Scanner Ҫ������ = new Scanner(System.in);
        //�½�Scanner����Ϊ"Ҫ������"

        String ����˰汾 = null;
        String ������������� = null;
        String ������ļ����� = null;
        String Զ�ŷ���˴�汾 = null;
        //��ʼ������Ϊnull

        System.out.println("----------------------------------------------");
        System.out.println("������Ҫ���صķ����:(�����)");
        System.out.println("1   ԭ������   2 Purpur�����(Paper��֧)  3    Spigot�����   4 CraftBukkit�����");
        System.out.println("5   ī�˷����   6 Fabric�����            7    ԭ������(Զ�Ű汾)             ");
        int ��������� = Ҫ������.nextInt();
        //Ҫ�������������,���ҷŽ�"���������"int������
        if (��������� == 1) {


            System.out.println("����Ҫ���صķ���˰汾��(1.2.5������)(֧�ֿ���13w16a����)");
            ����˰汾 = Ҫ������.next();
            //Ҫ���������˰汾,�����浽����˰汾������

            System.out.println("ѡ����Ҫʹ�õľ���Դ:(�����)");
            System.out.println("1 MojangԴ 2 BMCLAPIԴ 3 MCBBSԴ");
            int ����Դ = Ҫ������.nextInt();
            //Ҫ����������Դ���

            if (����Դ == 1){
                ������������� = "https://www.mcjars.com/get/vanilla-" + ����˰汾 + ".jar";
                ������ļ����� = ����˰汾 + ".jar";
                //�ٷ�Դ
            } else {
                if (����Դ == 2){
                    ������������� = "https://bmclapi2.bangbang93.com/version/" + ����˰汾 + "/server";
                    //BMCLAPIԴ
                }else {
                    ������������� = "https://download.mcbbs.net/version/" + ����˰汾 + "/server";
                    //MCBBSԴ
                }
                ������ļ����� = "server";
            }

        } else {
            if (��������� == 2) {

                System.out.println("����Ҫ���صķ���˰汾��(1.14.4������)");
                ����˰汾 = Ҫ������.next();
                //Ҫ���������˰汾,�����浽����˰汾������

                ������������� = "https://api.purpurmc.org/v2/purpur/" + ����˰汾 + "/latest/download";
                ������ļ����� = "download";
            } else {
                if (��������� == 3){

                    //������������=3���д˴��Ĵ���(��ʼ)
                    System.out.println("����Ҫ���صķ���˰汾��(1.0.0������)");
                    ����˰汾 = Ҫ������.next();
                    //Ҫ���������˰汾,�����浽����˰汾������

                    System.out.println("����˰汾�Ƿ�С�ڻ����1.16.5?(����true,����false)");
                    boolean cdn = Ҫ������.nextBoolean();
                    //Getbukkit�д���1.16.5(����)����������download.С��1.16.5����������cdn

                    if (!cdn){
                        ������������� = "https://download.getbukkit.org/spigot/spigot-" + ����˰汾 + ".jar";
                    }else {
                        ������������� = "https://cdn.getbukkit.org/spigot/spigot-" + ����˰汾 + ".jar";
                    }
                    ������ļ����� = "spigot-" + ����˰汾 + ".jar";
                    //������������=3���д˴��Ĵ���(����)
                }else{
                    if (��������� == 4){
                        System.out.println("����Ҫ���صķ���˰汾��(1.0.0������)");
                        ����˰汾 = Ҫ������.next();
                        //Ҫ���������˰汾,�����浽����˰汾������

                        System.out.println("����˰汾�Ƿ�С�ڻ����1.16.5?(����true,����false)");
                        boolean cdn = Ҫ������.nextBoolean();
                        //Getbukkit�д���1.16.5(����)����������download.С��1.16.5����������cdn

                        if (!cdn){
                            ������������� = "https://download.getbukkit.org/craftbukkit/craftbukkit-" + ����˰汾 + ".jar";
                        }else {
                            ������������� = "https://cdn.getbukkit.org/craftbukkit/craftbukkit-" + ����˰汾 + ".jar";
                        }
                        ������ļ����� = "craftbukkit-" + ����˰汾 + ".jar";
                    }else {
                        if (��������� == 5){
                            System.out.println("����Ҫ���صİ汾��(1.12.2��1.16.5)");
                            ����˰汾 = Ҫ������.next();
                            //Ҫ���������˰汾,�����浽����˰汾������

                            ������������� = "https://mohistmc.com/api/"+ ����˰汾 +"/latest/download";
                            ������ļ����� = "download";
                            //���ط���˲�����
                        }else {
                            if (��������� == 6){
                                System.out.println("����Ҫ���صİ汾��(1.14������)");
                                ����˰汾 = Ҫ������.next();
                                //Ҫ���������˰汾,�����浽����˰汾������

                                System.out.println("����Ҫ���ص�Fabric�汾(��ʹ���������鿴������'0.14.13')");
                                String Fabric�汾 = Ҫ������.next();

                                ������������� = "https://meta.fabricmc.net/v2/versions/loader/" + ����˰汾+ "/" + Fabric�汾 +"/0.11.1/server/jar";
                                ������ļ����� = "jar";
                                //���ط���˲�����
                            }else {
                                if (��������� == 7){
                                    System.out.println("�������˴�汾(��������alpha beta classic)");
                                    Զ�ŷ���˴�汾 = Ҫ������.next();
                                    System.out.println("�������˰汾(alpha����'a0.x.x'" +
                                            " beta����'b1.x.x' " +
                                            "classic����c1.x.x)");
                                    ����˰汾 = Ҫ������.next();
                                    ������������� = "http://files.betacraft.uk/server-archive/" + Զ�ŷ���˴�汾 + "/" + ����˰汾 + ".jar";
                                    ������ļ����� = ����˰汾 + ".jar";
                                    //���ط���˲�����
                                }
                            }
                        }
                    }
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

        System.out.println("������ɺ�,����true���������,Ҳ���ڷ��������Ŀ¼��������java -jar " + ������ļ����� + "���з����.");
        //��ʾ����true������˵��

        boolean Start = Ҫ������.nextBoolean();
        if (Start){
            try {
                Runtime.getRuntime().exec("cmd /k start java -jar " + ������ļ����� );
            } catch (IOException e) {
                throw new RuntimeException(e);
                //��������˵Ĵ���
            }
        }else{
            System.exit(233);
            //�˳��Ĵ���
        }
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
        System.out.println("�汾:2.0.0\n" +
                "����ʱ��: 2022/1/20 21:36");
    }
}
