abstract class Agenda 
{
    abstract void task1(); 
    void show()
    {
        System.out.println("implimentation method show");
    }   
}
class test extends Agenda
{
    void task1()
    {
        System.out.println("task done...");
    }
    public static void main(String[] args) 
    {
        test obj=new test();
        obj.task1();
        obj.show();    
    }
}