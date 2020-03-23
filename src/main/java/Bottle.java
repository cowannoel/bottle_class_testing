public class Bottle {
    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getDrink(){
        return this.volume - 10;
    }


    public int getEmpty() {
        return this.volume = 0;
    }


    public int getFull() {
        return this.volume = 100;
    }
}
