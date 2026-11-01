public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
         System.out.println("Hello!");
         long earthsunDistance = 1496000000L;
         System.out.println("Earth-Sun distance: " + earthsunDistance + " km");
         System.out.println("Khaled" + " " + "Mohamed");
         System.out.println("Khaled" + "Mohamed");
         // Type Data
         //1- int , 2- long , 3- float , 4- double , 5-char 'R' , 6- boolean , 7- String 'dfd' , short , byte 0->7
         String name = "Khaled";
         String lastName = "Mohamed";
         System.out.println(name + " " + lastName);
         //boolean true or false 
         boolean isEqual = (name == lastName);
         System.out.println(isEqual); //false 
         //boolean isEqual2 = (1+1+1) == (3);
         //boolean isEqual3 = (1+1+1 == 3);
         //System.out.println(isEqual2); //true
         //System.out.println(isEqual3); //true
         // =   , ==
         byte b = 127;
         byte b2 = -128;
        // byte b3 = 1111520; // error because the value is out of range for byte -128 to 127
         int hhaled = 150;
         //char khaled = 'k';
         String khaled2 = "Klfjjmslfk";
         System.out.println(b);
         System.out.println(b2);
         //System.out.println(b3);
         System.out.println(hhaled);
         System.out.println(khaled2);

         float f = 1.5f;
         double d = 1.5;
         System.out.println(f);
         System.out.println(d);


         int aa = 21;
         int bb = 45;
         //swapping aa= 45 , bb=21
         //print value before swapping
         System.out.println("Before swapping: aa = " + aa + ", bb = " + bb);
         // swapping logic
         int temp = aa; //21
            aa = bb; //45
            bb = temp; //21
         //print value after swapping
         System.out.println("After swapping: aa = " + aa + ", bb = " + bb);



         int x = 10;
         int y = 20;
            //swapping x= 20 , y=10
            int xx = x;
            x = y;
            y = xx;
            System.out.println("After swapping: x = " + x + ", y = " + y);
            // System.out.println("After Swapping : + x + ", y = " + y);

            int oo = 90 ;
            int pp = 100;
            //swapp
            int omar = oo;
            oo = pp;
            pp = omar;
            System.out.println(" oo = " + oo);
            System.out.println("pp = " + pp);

            /* 
            //information about name
            // 0khaled     _ -
            String last_name = "khaled";
            System.out.println("last_name = " + last_name);
            */

            int aas = 500;
            int bbs = 400;
            aas += bbs;
            System.out.println(aas);
    }
}

