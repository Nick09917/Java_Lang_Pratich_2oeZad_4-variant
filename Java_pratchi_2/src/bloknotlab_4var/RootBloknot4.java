
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

/// Делаем новый класс4,который является наследником Абстрактным классом3, и реализует методы интерфейса
/// Реализуем методы 3 абстратного класса
/// переопределяем метод ToString
/// Добавляем поля name, оно понадобиться нам для 2ой работы

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
        System.out.println("Запоминаем Акканут"); // Перезаписываем метод класса 3 запоминания
    }
    
    @Override
    public void colour(){
        System.out.println("Цвет заливки: красый"); // Перезаписываем метод класса 3 Цвет заливки
    }
  @Override
  public void update() {
        System.err.println("Обновление выключить");  // Перезаписываем интерфейс,который подключен в 3 классе
    }
 
  @Override
    public String toString() {
        return name + " " + "RootBloknot4{" + "Напоминание=" + text + ", Время=" + time + ", День=" + day + ", Включенный звук=" + Vkl_zvuk + ", Сколько раз напоминать=" + napom + '}';
    }
  
  
  
  
  private List<RootBloknot4> AllBloknot = new ArrayList<>(); //Создаем Лист,Сет и Мапу, указываем в дженерике
  private HashSet<RootBloknot4> AllBloknotSet = new HashSet<>(); //Что данные,которые они будут принимать
  private Map<Integer,RootBloknot4> AllBloknotmap = new HashMap<>(); // Являются экземпляры класса RootBloknot4
// Являются экземпляры класса RootBloknot4
  
  
       public void collections(int x){ //Реализуем метод Коллекции,который на вход принимает число
       try{
        Scanner sc = new Scanner(System.in); // Данное,число указывает,Сколько экземпляров мы хотим получить
        int id = 0;
        int nom = 1;
        for (int i = 0; i < x; i++) {     //Заводим цикл,который будет опрашивать нас,о каждом поле
            id++;                   // заводим отдельный подсчет,для ключа карты. Можно было сделать name как ключ,но мне исправил магистрант на int ключи
            System.out.println("Введите название заметки: " + nom); 
            sc.nextLine();
            String nname = sc.nextLine();
            
            System.out.println("Введите текст заметки: " + nom);  
            String ttext = sc.nextLine();
           
            System.out.println("Введите время напоминания заметки:" + nom);
            String ttime = sc.nextLine();
           
            
            System.out.println("Введите день напоминания:" + nom);
            String dday = sc.nextLine();
            
            boolean zzz = true;
            System.out.println("Введите Сколько раз напоминать:" + nom);
            int nap = sc.nextInt();
            nom++;
           
            /// Добавляем по циклу каждый экземпляр класса в Лист,мап и хешсет
             AllBloknot.add(new RootBloknot4(nname,ttext,ttime,dday,zzz,nap)); 
             AllBloknotSet.add(new RootBloknot4(nname,ttext,ttime,dday,zzz,nap));
             AllBloknotmap.put(id,new RootBloknot4(nname,ttext,ttime,dday,zzz,nap));
        }
       } catch (Exception e) {
                System.out.println("Введеные неверные данные,Число напоминаний должно быть int ");
                System.exit(1);
            }
       
        ///Удаляем в каждой коллекции 1 элемент
        AllBloknot.remove(0); // В листе указываем индекс 
        Iterator iterator = AllBloknotSet.iterator(); //в ХешСет нельзя удалить элемент по индексу
                if(iterator.hasNext())    { // Заводим итератор, (Найдено в интернете) 
                iterator.next(); // Вернет "первый" элемент
                iterator.remove(); // Удалит "первый" элемент
                                        }
        AllBloknotmap.remove(1);    //В карте удаляем элемент по ключу,который я выделил каждому id
        
        System.err.println("Вы хотите заменить объекты? Y/N?");   //Спрашиваем пользователя заменить ли произвольно элементы 
        Scanner gb = new Scanner(System.in);
        String answer = gb.nextLine();
        if("Y".equals(answer)){    /// Если ответ будет положительный,то программа запросит,новые данные для нового экземлпяра класса
            System.out.println("Введите новые данные для объекта");
            Scanner pp = new Scanner(System.in);
            RootBloknot4 news = new RootBloknot4();
            System.out.println("Введите название заметки: "); 
            news.setName(pp.nextLine());
            System.out.println("Введите текст заметки"); 
            news.setText(pp.nextLine());
            System.out.println("Введите День Заметки ");  
            news.setDay(pp.nextLine());
            System.out.println("ВВедите Время заметки");
            news.setTime(pp.nextLine());
            System.out.println("Введите Сколько раз напоминать");
            news.setNapom(pp.nextInt());
            news.setVkl_zvuk(true);
            
            AllBloknot.set(1,news); /// Меняем произвольный элемент в Листе 
            System.out.println("Введите Ключ Элемента который поменяете в Мапе"); /// Спрашивем пользователя ключ элемента который поменяем
            Scanner nn = new Scanner(System.in);
            int key = nn.nextInt();
            AllBloknotmap.replace(key, news); /// Меняем элемент по заданному ключу
           
            ///Выводим измененые элементы циклами, цикл для вывода мапы взят с интернета.
            System.out.println("Содержание Изм Листа"); 
            for (RootBloknot4 kolvo : AllBloknot) {
            System.out.println(kolvo);
        }
         System.out.println("----------------------");
            System.out.println("Содержание Изм Сета");
             for (RootBloknot4 kolvo : AllBloknotSet) {
            System.out.println(kolvo);
        }
             System.out.println("----------------------");
              System.out.println("Cодержание Изм Карты");
             for(Map.Entry<Integer,RootBloknot4 > item : AllBloknotmap.entrySet()){
         
           System.out.printf("Ключ ID: %s  Содержания заметки: %s \n", item.getKey(), item.getValue());
       }
           
           } // Konec Cikla
        
       /// Выводим Незимененный Лист,если человек не захотел произвольно менять элементы Листа и Мапы
        else{
         System.out.println("Содержание Листа"); 
        for (RootBloknot4 kolvo : AllBloknot) {
            System.out.println(kolvo);
        }
        System.out.println("----------------------");
            System.out.println("Содержание Сета"); 
        for (RootBloknot4 kolvo : AllBloknotSet) {
            System.out.println(kolvo);
        }
         System.out.println("----------------------");
              System.out.println("Cодержание Карты");
         for(Map.Entry<Integer,RootBloknot4 > item : AllBloknotmap.entrySet()){
         
           System.out.printf("Ключ ID: %s  Содержания заметки: %s \n", item.getKey(), item.getValue());
       }
  } 
  
       }

 
   } 
  






