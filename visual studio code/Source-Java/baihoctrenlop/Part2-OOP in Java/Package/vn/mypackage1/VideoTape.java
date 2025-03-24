package vn.mypackage1;
public class VideoTape
{
 
    String name;
    int length;
    
    public VideoTape(String name, int length)
    {
        this.name = name;
        this.length = length;
    }
    
    public VideoTape(String name)
    {
        this.name = name;
        this.length = 90;
    }
    
 
    public void show()
    {
        System.out.println("***********VIDEO TAPE*************\n");
        System.out.println("NAME:\t"+this.name+"\n");
        System.out.println("LENGTH:\t"+this.length+"\n");
        System.out.println("************************\n");
    }
}