interface Shape{
    public String  getshape();
}

 class  Circle  implements Shape{
    public String getshape()
    {
        return "cicle";
    }
}
class rectangle implements Shape{
    public String getshape()
    {
        return "rectangle";
    }
}
class square implements Shape{
    public String getshape()
    {
       return "square";
    }
}
class shapefactory
{
    public Shape getshapename(String shapetype)
    {
        if(shapetype == null){
            return null;}

        if(shapetype.equals("circle"))
        {
            return new Circle();
        }

        if(shapetype.equals("rectangle"))
        {
            return new rectangle();
        }
        if(shapetype.equals("square")){
            return new square();
        }

        return null;
    }
}
public class Factory_design_pattern {

    public static void main(String [] args)
    {
        shapefactory sf = new shapefactory();
        Shape shape1 = sf.getshapename("circle");
        System.out.println("shape: "+ shape1.getshape());

        Shape shape2 = sf.getshapename("rectangle");
        System.out.println("shape: "+ shape2.getshape());

    }
}
