import java.lang.Cloneable;

class House implements Cloneable{
    private int HouseNumber;
    private float area;
    private int price;

    public House(int HouseNumber,float area,int price){
        this.HouseNumber=HouseNumber;
        this.area=area;
        this.price=price;
    }

    public void Details(){
        System.out.println("House Number : " + HouseNumber);
        System.out.println("Area : " + area);
        System.out.println("Price : " + price);
    }

    public House Clone(){
        House cloneHouse = null;
        try{
            cloneHouse = (House) super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cloneHouse;
    }

    public void setArea(float area) {
        this.area = area;
    }
    public void setHouseNumber(int houseNumber) {
        HouseNumber = houseNumber;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public float getArea() {
        return area;
    }
    public int getHouseNumber() {
        return HouseNumber;
    }
    public int getPrice() {
        return price;
    }

}

class TwoBHK extends House{
    private int FurniturCharge;

    public TwoBHK(int HouseNumber, float area, int price,int charge) {
        super(HouseNumber, area, price);
        FurniturCharge = charge;
    }

    public void Details(){
        System.out.println();
        System.out.print("2BHK");
        System.out.print("\tHouse Number : " + getHouseNumber());
        System.out.print("\tArea : " + getArea());
        System.out.print("\tPrice : " + getPrice());
        System.out.print("\tFurniture Charge : " + FurniturCharge);
    }
    
    
}

class ThreeBHK extends House{

    private int ParkingCharge;
    
    public ThreeBHK(int HouseNumber, float area, int price,int charge) {
        super(HouseNumber, area, price);
        ParkingCharge = charge;
    }

    public void Details(){
        System.out.println();
        System.out.print("3BHK");
        System.out.print("\tHouse Number : " + getHouseNumber());
        System.out.print("\tArea : " + getArea());
        System.out.print("\tPrice : " + getPrice());
        System.out.print("\tParking Charge : " + ParkingCharge);
    }
}



public class Prototype_pattern {
    public static void main(String[] args) {
        
        House h1 = new TwoBHK(10, 152.25f, 5620,20);
        h1.Details();
        House h2 = new ThreeBHK(20, 180.25f, 9820,40);
        h2.Details();

        House Clone2BHK = h1.Clone();
        Clone2BHK.setHouseNumber(11);
        Clone2BHK.Details();
        System.out.println(h1==Clone2BHK);

    }
    
}
