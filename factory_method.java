class Test 
{
   private Test(){}

    void method1()
   {
        System.out.println("I am method-1()");
   }

   static Test getObject()
   {
        System.out.println("I am getObject() method used as Factory Method");
        Test obj = new Test();
        return obj;
   }
    
    public static void main(String[] args) 
    {
        Test t = Test.getObject();
        t.method1();
    }
}

// Output :
// =========
// I am getObject() method used as Factory Method
// I am method-1()
