
package bloknotlab_4var;


public class RootBloknot {

    @Override
    public String toString() {
        return "RootBloknot{" + "����������� =" + text + ", �����=" + time + ", ����=" + day + '}';
    }

    public RootBloknot(String text, String day) {
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

    public RootBloknot(String text, String time, String day) {
        this.text = text;
        this.time = time;
        this.day = day;
    }

    public RootBloknot() {
    }
    
    private String text;
    private String time;
    private String day;
    
}
/// ������� ����� ����� �� �������, ��� ������ ����������� �������, �������� ���� �������, ��� ����� � ����.
/// ���������� �������,�������, ��� ��� ��� ������������, ������ ����� ToString ��� �������� ������
/// ���������� ������������,��� �������� ��������