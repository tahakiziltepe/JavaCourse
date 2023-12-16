

class a008_Computer
{
    public void playMusic()
    {
        System.out.println("Music playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        // We do not have to use "else" here because if the method returns at the first condition it will jump out from this method.
        return "Nothing";
    }

}


public class a008_Methods {
    public static void main(String[] args) 
    {
        
        a008_Computer obj = new a008_Computer();
        obj.playMusic();
        String str = obj.getMeAPen(22);
        System.out.println(str);

    }
}
