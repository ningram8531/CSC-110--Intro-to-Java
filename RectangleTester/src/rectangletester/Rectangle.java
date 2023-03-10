
package rectangletester;


public class Rectangle 
{
    //Instance variables
    private double length = 0.0;
    private double width = 0.0;
    
    
    public Rectangle(double len , double wid)
    {
        length = len;
        width = wid;
    }
    
    public Rectangle ()
    {
        length = 0;
        width = 0;
    }
            
            
    public void setLength(double len)
    {
    // store the value len into the 
    // instance variable length
        
        length = len;
    }
    
    public void setWidth(double wid)
    {
    // store the value wid into the 
    // instance variable width
        
        width = wid;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getArea()
    {
        return length * width;
    }
}
