import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float chieudai = 4.5f;
        float chieurong = 5.6f ;
        float bankinh = 32f;
        float dientich= HinhChuNhat.Dientichhinhchunhat(chieudai,chieurong);
        float chuvi= HinhChuNhat.Chuvihinhchunhat(chieudai,chieurong);
        System.out.println("Diện tích và chu vi hình chữ nhật");
        System.out.println(dientich);
        System.out.println(chuvi);
        float dientichhinhtron = Hinhtron.Dientichhinhtron(bankinh);
        float chuvihinhtron = Hinhtron.ChuviHinhtron(bankinh);
        System.out.println("Diện tích và chu vi hình tròn là :");
        System.out.println(dientichhinhtron);
        System.out.println(chuvihinhtron);
        }
    }
