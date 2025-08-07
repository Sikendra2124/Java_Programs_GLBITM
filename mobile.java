class phone {
    private String brand;
    private int Ram;
    private int storage;
    private String OS;
    phone(String brand, int Ram, int storage, String OS){
        this.brand=brand;
        this.Ram=Ram;
        this.storage=storage;
        this.OS=OS;
    }
    public int getRam(){
        return Ram;
    }
    public void setRam(int Ram){
        this.Ram=Ram;
    }
    public int getStorage(){
        return storage;
    }
    public void setStorage(int storage){
        this.storage=storage;
    }
    public void setOS(String OS){
        this.OS=OS;
    }
    void display(){
        System.out.println(brand);
        System.out.println(Ram);
        System.out.println(storage);
        System.out.println(OS);
    }

    public String getOS() {
            return "os";
    }
}

public class mobile {
    public static void main(String[] args){
        phone p=new phone("oppo",8,512,"windows11");
        p.display();
        System.out.println(p.getOS());
    }
}
