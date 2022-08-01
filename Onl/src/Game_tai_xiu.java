import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Game_tai_xiu {
    public static void main(String[] args) {
        double taikhoannguoichoi = 5000000;
        Scanner scanner = new Scanner(System.in);
        Locale lc = new Locale("vi", "VN");
//        NumberFormat numf = NumberFormat.getInstance(lc);
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        int luaChon = 0;
        do {
            System.out.println("########## Mời Bạn Lựa Chọn ##########");
            System.out.println("chọn 1 để tiếp tục chơi: ");
            System.out.println("chọn phím bất kì để thoát: ");
            luaChon = scanner.nextInt();
            if (luaChon == 1) {
                System.out.println("**** Bắt Đầu Nào: ");
                System.out.println("****** Tài Khoản của bạn là : " +numf.format(taikhoannguoichoi) + ", Bạn Muốn Cược Bao nhiêu: ");
                double datcuoc = 0;
                do {
                    System.out.println("***** Đặt Cược: (0 < số tiền cược <=" + numf.format(taikhoannguoichoi) + ":");
                    datcuoc = scanner.nextDouble();
                }while (datcuoc <= 0 || datcuoc > taikhoannguoichoi);
                int luachontaixiu = 0;
                do {
                    System.out.println("***** Chọn: 1 <-> tài hoặc 2 <-> xỉu");
                    luachontaixiu = scanner.nextInt();
                }while (luachontaixiu != 1 && luachontaixiu != 2);

                Random xucxac1 = new Random();
                Random cucxac2 = new Random();
                Random xucxac3 = new Random();


                int giatri1 = xucxac1.nextInt(5) + 1;
                int giatri2 = cucxac2.nextInt(5) + 1;
                int giatri3 = xucxac3.nextInt(5) + 1;

                System.out.println("kết quả: "+ giatri1+"-"+giatri2+"-"+giatri3);
                int tong = giatri1 + giatri2 + giatri3;
                if (tong == 3 || tong == 18) {
                    System.out.println("***** Tổng là:"+ tong+" => Nhà cái ăn hết, bạn đã thua");
                    System.out.println("***** Tài khoản của bạn là: "+ numf.format(taikhoannguoichoi));

                }else if (tong >= 4 && tong <= 10) {
                    System.out.println("***** Tổng là:" + tong + " => Xỉu");
                    if (luachontaixiu == 2){
                        System.out.println("***** Bạn đã thắng cược: ");
                        taikhoannguoichoi += datcuoc;
                        System.out.println("***** Tài khoản của bạn là: " + numf.format(taikhoannguoichoi));
                    }else {
                        System.out.println("***** Bạn đã thắng cược: ");
                        taikhoannguoichoi += datcuoc;
                        System.out.println("***** Tài khoản của bạn là: " + numf.format(taikhoannguoichoi));
                    }
                }else  {
                    System.out.println("***** Tổng là:" + tong + " => Tài");
                    if (luachontaixiu == 1){
                        System.out.println("***** Bạn đã thắng cược: ");
                        taikhoannguoichoi += datcuoc;
                        System.out.println("***** Tài khoản của bạn là: " + numf.format(taikhoannguoichoi));
                    }else {
                        System.out.println("***** Bạn đã thắng cược: ");
                        taikhoannguoichoi += datcuoc;
                        System.out.println("***** Tài khoản của bạn là: " + numf.format(taikhoannguoichoi));
                    }
                }
            }
        }while (luaChon == 1);
    }
}
