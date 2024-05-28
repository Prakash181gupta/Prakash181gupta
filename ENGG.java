class ABC
{
static int a;
       int b;
	   ABC()
	   {
	   System.out.println("this is the construction");
	   }
	   void add()
	   {
	   System.out.println("The main method");
	   }
	   static
	   {
	   a = 10;
	   System.out.println("This is static block1");
	   }
	   static 
	   {
	   a = 20;
	   System.out.println("This is static block2");
	   }
	   {
	   System.out.println("This is the non-static block1 from class ABC");
	   b =10;
	   }
	   {
	   b=11;
	   System.out.println("This is the non-static block2 from class ABC");
	   }
	   }
	   class RET
{
static int a;
       int b;
	   RET()
	   {
	   System.out.println("this is the construction");
	   }
	   void sub()
	   {
	   System.out.println("The main method");
	   }
	   static
	   {
	   a = 13;
	   System.out.println("This is static block1");
	   }
	   static 
	   {
	   a = 21;
	   System.out.println("This is static block2");
	   }
	   {
	   b =9;
	   System.out.println("This is the non-static block1 from class ABC");
	   }
	   {
	   b=12;
	   System.out.println("This is the non-static block2 from class ABC");
	   }
	   }
	   class ENGG
	   {
		   static
		   {
			 System.out.println("The Start the main static m");  
		   }
	   public static void main(String[] args)
	   {
	   System.out.println("The Start the main method");
	   ABC x = new ABC();
	   x.add();
	   RET y = new RET();
	   y.sub();
	   System.out.println("The Start the main method");
	   }
	   }