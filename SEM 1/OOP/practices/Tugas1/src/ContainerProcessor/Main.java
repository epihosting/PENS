package ContainerProcessor;

public class Main {

    public static void main(String[] args) {
        Container sumber = new Sumur();
        Container small = new Glass(0, 1);
        Container med = new Glass(0, 5);
        Container big = new Glass(0, 10);
        
        
        //Soal no 2
//        med.fillCountainer(sumber);
//        small.fillCountainer(sumber);
//        big.fillCountainer(med);
//        big.fillCountainer(small);
        
//        Soal No 1
        med.fillCountainer(sumber);
        small.fillCountainer(med);
//        big.fillCountainer(med);
        
//        //Test
//        small.fillCountainer(sumber);
//        med.fillCountainer(small);
        
        System.out.println(sumber.volume);
        
    }
}
