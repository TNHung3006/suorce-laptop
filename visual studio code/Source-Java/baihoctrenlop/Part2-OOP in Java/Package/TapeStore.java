import vn.mypackage1.*;
public class TapeStore
{
    public static void main(String args[])
    {
        VideoTape v1 = new VideoTape("Vocano");

        VideoTape v2 = new VideoTape("Harry Potter", 180);
        v1.show();
        v2.show();
        
    }
}