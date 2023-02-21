
package bloknotlab_4var;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;

/// ������ ����� �����4,������� �������� ����������� ����������� �������3, � ��������� ������ ����������
/// ��������� ������ 3 ����������� ������
/// �������������� ����� ToString
/// ��������� ���� name, ��� ������������ ��� ��� 2�� ������

public class RootBloknot4 extends RootBloknot3 implements I_RootBloknot3 {

    public RootBloknot4(String name, String text, String time, String day, boolean Vkl_zvuk, int napom) {
        super(text, time, day, Vkl_zvuk, napom);
        this.name = name;
    }
 
    
    
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    private String name;
    
    
    
    public RootBloknot4() {
    }
    
   

    
   

    @Override
    public void zapominanie(){
        System.out.println("���������� �������"); // �������������� ����� ������ 3 �����������
    }
    
    @Override
    public void colour(){
        System.out.println("���� �������: ������"); // �������������� ����� ������ 3 ���� �������
    }
  @Override
  public void update() {
        System.err.println("���������� ���������");  // �������������� ���������,������� ��������� � 3 ������
    }
 
  @Override
    public String toString() {
        return name + " " + "RootBloknot4{" + "�����������=" + text + ", �����=" + time + ", ����=" + day + ", ���������� ����=" + Vkl_zvuk + ", ������� ��� ����������=" + napom + '}';
    }
  
  
  
  
  private List<RootBloknot4> AllBloknot = new ArrayList<>(); //������� ����,��� � ����, ��������� � ���������
  private HashSet<RootBloknot4> AllBloknotSet = new HashSet<>(); //��� ������,������� ��� ����� ���������
  private Map<Integer,RootBloknot4> AllBloknotmap = new HashMap<>(); // �������� ���������� ������ RootBloknot4
// �������� ���������� ������ RootBloknot4
  
  
       public void collections(int x){ //��������� ����� ���������,������� �� ���� ��������� �����
       try{
        Scanner sc = new Scanner(System.in); // ������,����� ���������,������� ����������� �� ����� ��������
        int id = 0;
        int nom = 1;
        for (int i = 0; i < x; i++) {     //������� ����,������� ����� ���������� ���,� ������ ����
            id++;                   // ������� ��������� �������,��� ����� �����. ����� ���� ������� name ��� ����,�� ��� �������� ���������� �� int �����
            System.out.println("������� �������� �������: " + nom); 
            sc.nextLine();
            String nname = sc.nextLine();
            
            System.out.println("������� ����� �������: " + nom);  
            String ttext = sc.nextLine();
           
            System.out.println("������� ����� ����������� �������:" + nom);
            String ttime = sc.nextLine();
           
            
            System.out.println("������� ���� �����������:" + nom);
            String dday = sc.nextLine();
            
            boolean zzz = true;
            System.out.println("������� ������� ��� ����������:" + nom);
            int nap = sc.nextInt();
            nom++;
           
            /// ��������� �� ����� ������ ��������� ������ � ����,��� � ������
             AllBloknot.add(new RootBloknot4(nname,ttext,ttime,dday,zzz,nap)); 
             AllBloknotSet.add(new RootBloknot4(nname,ttext,ttime,dday,zzz,nap));
             AllBloknotmap.put(id,new RootBloknot4(nname,ttext,ttime,dday,zzz,nap));
        }
       } catch (Exception e) {
                System.out.println("�������� �������� ������,����� ����������� ������ ���� int ");
                System.exit(1);
            }
       
        ///������� � ������ ��������� 1 �������
        AllBloknot.remove(0); // � ����� ��������� ������ 
        Iterator iterator = AllBloknotSet.iterator(); //� ������ ������ ������� ������� �� �������
                if(iterator.hasNext())    { // ������� ��������, (������� � ���������) 
                iterator.next(); // ������ "������" �������
                iterator.remove(); // ������ "������" �������
                                        }
        AllBloknotmap.remove(1);    //� ����� ������� ������� �� �����,������� � ������� ������� id
        
        System.err.println("�� ������ �������� �������? Y/N?");   //���������� ������������ �������� �� ����������� �������� 
        Scanner gb = new Scanner(System.in);
        String answer = gb.nextLine();
        if("Y".equals(answer)){    /// ���� ����� ����� �������������,�� ��������� ��������,����� ������ ��� ������ ���������� ������
            System.out.println("������� ����� ������ ��� �������");
            Scanner pp = new Scanner(System.in);
            RootBloknot4 news = new RootBloknot4();
            System.out.println("������� �������� �������: "); 
            news.setName(pp.nextLine());
            System.out.println("������� ����� �������"); 
            news.setText(pp.nextLine());
            System.out.println("������� ���� ������� ");  
            news.setDay(pp.nextLine());
            System.out.println("������� ����� �������");
            news.setTime(pp.nextLine());
            System.out.println("������� ������� ��� ����������");
            news.setNapom(pp.nextInt());
            news.setVkl_zvuk(true);
            
            AllBloknot.set(1,news); /// ������ ������������ ������� � ����� 
            System.out.println("������� ���� �������� ������� ��������� � ����"); /// ��������� ������������ ���� �������� ������� ��������
            Scanner nn = new Scanner(System.in);
            int key = nn.nextInt();
            AllBloknotmap.replace(key, news); /// ������ ������� �� ��������� �����
           
            ///������� ��������� �������� �������, ���� ��� ������ ���� ���� � ���������.
            System.out.println("���������� ��� �����"); 
            for (RootBloknot4 kolvo : AllBloknot) {
            System.out.println(kolvo);
        }
         System.out.println("----------------------");
            System.out.println("���������� ��� ����");
             for (RootBloknot4 kolvo : AllBloknotSet) {
            System.out.println(kolvo);
        }
             System.out.println("----------------------");
              System.out.println("C��������� ��� �����");
             for(Map.Entry<Integer,RootBloknot4 > item : AllBloknotmap.entrySet()){
         
           System.out.printf("���� ID: %s  ���������� �������: %s \n", item.getKey(), item.getValue());
       }
           
           } // Konec Cikla
        
       /// ������� ������������ ����,���� ������� �� ������� ����������� ������ �������� ����� � ����
        else{
         System.out.println("���������� �����"); 
        for (RootBloknot4 kolvo : AllBloknot) {
            System.out.println(kolvo);
        }
        System.out.println("----------------------");
            System.out.println("���������� ����"); 
        for (RootBloknot4 kolvo : AllBloknotSet) {
            System.out.println(kolvo);
        }
         System.out.println("----------------------");
              System.out.println("C��������� �����");
         for(Map.Entry<Integer,RootBloknot4 > item : AllBloknotmap.entrySet()){
         
           System.out.printf("���� ID: %s  ���������� �������: %s \n", item.getKey(), item.getValue());
       }
  } 
  
       }

 
   } 
  






