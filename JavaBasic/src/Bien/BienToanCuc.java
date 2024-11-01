package Bien;

public class    BienToanCuc  {

    // Biếm toàn cụcT
    String address = "Hải Phòng";




    //Khai báo hàm
    public String getName() {
        String name = "Mai"; //Biến local
        System.out.println(address);
        return name;
    }


    public void showInfo () {
            String phone = "012345";
            System.out.println(phone);
            System.out.println(address);
    }


    public void loginCRM() {
        String email = "";
        String password = "";
        System.out.println(address);

    }

    public static void main(String[] args ) {
        BienToanCuc bienToanCuc= new BienToanCuc();
        System.out.println(bienToanCuc.address  );
    }
}