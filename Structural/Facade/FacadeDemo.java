import java.util.Scanner;

interface MobileShop {

    void modelno();
    void price();

}



class Iphone implements MobileShop{


    public void modelno() {
        System.out.println("Model : Iphone X");
    }

    public void price() {
        System.out.println("Price : 800");
    }
}

class Samsung implements MobileShop{


    public void modelno() {
        System.out.println("Model : Samsung Galaxy S23");
    }

    public void price() {
        System.out.println("Price : 250 ");
    }
}

class Blackberry implements MobileShop{


    public void modelno() {
        System.out.println("Model : Blackberry z");
    }

    public void price() {
        System.out.println("Price : 300");
    }
}

class ShopKeeper {  
    private MobileShop iphone;  
    private MobileShop samsung;  
    private MobileShop blackberry;  
      
    public ShopKeeper(){  
        iphone= new Iphone();  
        samsung=new Samsung();  
        blackberry=new Blackberry();  
    }  
    public void iphoneSale(){  
        iphone.modelno();
        iphone.price();  
        
    }  
        public void samsungSale(){  
        samsung.modelno(); 
        samsung.price();  
    }  
   public void blackberrySale(){  
        blackberry.modelno();     
        blackberry.price();  
    }  
}  
public class FacadeDemo {
    public static void main(String[] args) {

        ShopKeeper sk1 = new ShopKeeper();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Brands : ");
        System.out.println("1.Iphone");
        System.out.println("2.Samsung");
        System.out.println("3.Blackberry");

        System.out.println("Enter the Brand : ");
        String Brand=sc.next();
        
        if(Brand.equalsIgnoreCase("Iphone")){
            sk1.iphoneSale();
        }
        else if(Brand.equalsIgnoreCase("Samsung")){
            sk1.samsungSale();
        }
        else if(Brand.equalsIgnoreCase("BlackBerry")){
            sk1.blackberrySale();
        }
        else{
            System.out.println("Sorry we do not have that mobile!!!");
        }

    }
}
