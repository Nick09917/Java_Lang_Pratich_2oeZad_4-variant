
package bloknotlab_4var;


public class RootBloknot2 {
    
    private String text;
    private String time;
    private String day;
    private boolean Vkl_zvuk;
    private int napom;
    
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

    public RootBloknot2(String text, String time, String day, int napom) {
        this.text = text;
        this.time = time;
        this.day = day;
        this.napom = napom;
    }

    public RootBloknot2(String text, String time, String day, boolean Vkl_zvuk, int napom) {
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

    

    public RootBloknot2(String text, String day) {
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

    public RootBloknot2(String text, String time, String day) {
        this.text = text;
        this.time = time;
        this.day = day;
    }

    public RootBloknot2() {
    }

    
}

/// Делаем копию первого класса и добавляем новые элементы для класса
/// Добавляем 2 строки Напоминания типа integer и вкл/выкл звук типа boolean