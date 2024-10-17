import ru.netology.javaqa95.HWmvn6.services.CalcRestMonth;

public class Main {
    public static void main(String[] args) {

        CalcRestMonth service = new CalcRestMonth();
        int count = service.calcMonth(0, 10_000, 3_000,20_000, 0);
        System.out.println("Количество отдыха " + count + " мес.");
    }
}
