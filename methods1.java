class Demo
{
    static void method1()
    {
        System.out.println("I am method-1()");
    }

    void method2()
    {
        System.out.println("I am method-2()");
        
    }
    public static void main(String[] args) 
    {
            Demo obj = new Demo();
            
            method1();
            Demo.method1();
            obj.method1();

            System.out.println("=====================");

           // method2();   Non Static method can not be called directly in the same class or outside class
           //Test.method2();  Non static method can not be called By the class in the same or outside the class
            obj.method2();
    }    
}

// output :
// ==========
// I am method-1()
// I am method-1()
// I am method-1()
// =====================
// I am method-2()