package ContainerProcessor;

public class Container {
    public int volume;
    public int maxVolume;
    
    public void empty() {
        volume = 0;
    }
    public void fill(Container ctr){
       /*
        * tempToFill adalah variable yang mendefinisikan kekurangan agar volume = maxVolume
        */
        int tempToFill = this.maxVolume - this.volume;
       /*
        * Jika volume dari Container lebih besar dari pada yang dibutuhkan
        */
        if (ctr.volume > tempToFill){
            this.volume += tempToFill;
            ctr.volume = ctr.volume - tempToFill;
        }
       /*
        * Jika volume dari container lebih kecil dari yang dibutuhkan
        */
        else if (ctr.volume < tempToFill) {
            this.volume += ctr.volume;
            ctr.volume  = 0;
        }
       /*
        * Jika volume dari container sama dengan yang dibutuhkan
        */
        else {
            this.volume += ctr.volume;
            ctr.volume  = ctr.volume - this.volume;
        }
    }    
}
