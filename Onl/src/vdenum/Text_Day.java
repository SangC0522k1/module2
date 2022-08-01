package vdenum;

public class Text_Day {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "toán, lý, hóa");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday,"văn, sử, địa");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday,"toán, văn, sinh");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thursday, "GDCD, thể dục");
        ThoiKhoaBieu tkb_t6 = new ThoiKhoaBieu(Day.Friday,"hóa, sinh, văn");

        System.out.println(tkb_t2);
        System.out.println(tkb_t3);
        System.out.println(tkb_t4);
        System.out.println(tkb_t5);
        System.out.println(tkb_t6);
    }
}
