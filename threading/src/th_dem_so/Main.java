package th_dem_so;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try
        {
            while(count.getMyThread().isAlive())
            {
                System.out.println("Hoạt động: ");
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Chuỗi chính bị gián đoạn: ");
        }
        System.out.println("Kết thúc: " );
    }
}
