// Q1 Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
public class EnumTest
{
    enum House{
        Bunglow(100),
        Apartment(95),
        duplex(88),
        villa(300);

        private final int price;

        House(int price) {
          this.price = price;
        }

        public int getPrice()
        {
            return price;
        }
    }

    public static void main(String [] args)
    {
      for(House h: House.values()){
          System.out.println(h+ " prices: "+ h.getPrice());
      }
    }
}
