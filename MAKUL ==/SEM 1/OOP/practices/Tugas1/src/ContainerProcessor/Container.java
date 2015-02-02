package ContainerProcessor;

public class Container {
    public int volume;
    public int MaxVolume;
    
    public void empty() {
        volume = 0;
    }
    public void fillCountainer(Container ctr){
       /*
        * Jika volume yang di ambil lebih besar dari pada yang dibutuhkan
        */
        
        int tempToFill = this.MaxVolume - this.volume;
        if (ctr.volume > tempToFill){
            this.volume += this.MaxVolume - this.volume;
            ctr.volume = ctr.volume - this.volume;
        }
        else if (ctr.volume < tempToFill) {
            this.volume += ctr.volume;
            ctr.volume  = 0;
        }
        else {
            this.volume += ctr.volume;
            ctr.volume  = ctr.volume - this.volume;
        }
    }    
}
