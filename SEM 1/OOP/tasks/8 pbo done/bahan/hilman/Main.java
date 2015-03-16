package ContainerProcessor;

public class Main {

    public static void main(String[] args) {
        Container sumber    = new Sumur();
        Container small     = new Glass(0, 1);
        Container med       = new Glass(0, 5);
        Container big       = new Glass(0, 10);
        
        
        //Soal no 2
        med.fill(sumber);
        small.fill(sumber);
        big.fill(med);
        big.fill(small);
        
//        Soal No 1
 //       med.fill(sumber);
//        small.fill(med);
        
        
        
        System.out.println("Isi dari gelas Big adalah " + big.volume + " Liter");
        System.out.println("Isi dari gelas Big adalah " + med.volume + " Liter");
        
    }
}
