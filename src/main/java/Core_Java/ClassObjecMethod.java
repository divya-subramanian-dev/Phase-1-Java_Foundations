// computer is a class that is a component 
class Computer
{
    //define what that component does the behaviour in methods
    public void playMusic()
    {
        System.out.println("Music Playing");
    }
    public String getMePen(int cost)
    {
        if(cost >= 10)
            return "Pen";

        return "Nothing";
    }
}
public class ClassObjecMethod 
{
    public static void main(String args[])
    {
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMePen(9);
        System.out.println(str);
    }
}

