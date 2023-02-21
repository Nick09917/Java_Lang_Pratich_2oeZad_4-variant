
package bloknotlab_4var;

///Делаем копию класса 2 и реализуем тут интерфейс.
///Тут же переопределяем эти методы,
///Добавляем методы часть из них не реализовываем делаем его абстрактным

public abstract class RootBloknot3 implements I_RootBloknot3 {

    public boolean isVkl_zvuk() {
        return Vkl_zvuk;
    }

    public void setVkl_zvuk(boolean Vkl_zvuk) {
        this.Vkl_zvuk = Vkl_zvuk;
    }

    public int getNapom() {
        return napom;
    }

    public void setNapom(int napom) {
        this.napom = napom;
    }

    public RootBloknot3(String text, String time, String day, int napom) {
        this.text = text;
        this.time = time;
        this.day = day;
        this.napom = napom;
    }

    public RootBloknot3(String text, String time, String day, boolean Vkl_zvuk, int napom) {
        this.text = text;
        this.time = time;
        this.day = day;
        this.Vkl_zvuk = Vkl_zvuk;
        this.napom = napom;
    }

    @Override
    public String toString() {
        return "RootBloknot2{" + "Напоминание=" + text + ", Время=" + time + ", День=" + day + ", Включенный звук=" + Vkl_zvuk + ", Сколько раз напоминать=" + napom + '}';
    }

    

    public RootBloknot3(String text, String day) {
        this.text = text;
        this.day = day;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public RootBloknot3(String text, String time, String day) {
        this.text = text;
        this.time = time;
        this.day = day;
    }

    public RootBloknot3() {
    }
    
    String text;
    String time;
    String day;
    boolean Vkl_zvuk;
    int napom;

    @Override
    public boolean Scrollbox() {
        System.err.println("Включенное появление в Панели уведомлений"); // переопределнный метод из интерфейса
        return true;
    }

    @Override
    public void update() {
        System.out.println("Поиск обновлений включен"); // Переопределенный метод из интерфейса
    }

    abstract void zapominanie(); // Абстрактный метод
    
    abstract void colour(); // Абстрактный метод
    
}

 