interface Musicplayer{
    void play();
    void stop();
}
class Mp3 implements Musicplayer{
    public void play(){
        System.out.println("Music is on ");
    }
    public void stop(){
        System.out.println("Music is pause ");
    }
}
class CD implements Musicplayer{
    public void play(){
        System.out.println("Disco Disco");
    }
    public void stop(){
        System.out.println("Gana bandh ho gaya ");
    }
}
class Music{
    public static void main(String[] args) {
        Mp3 m=new Mp3();
        CD c=new CD();
        m.play();
        m.stop();
        c.play();
        c.stop();
    }
} 
