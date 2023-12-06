public class App {
    public static void main(String[] args) {
    //polymorphism
    InfoLengkap pelanggan1 = new Pelanggan();
    //exception    
    try {
        pelanggan1.input();
    } 
    catch (Exception e){
        System.out.println("Error, input salah");
    }
        pelanggan1.struk();

    }
}