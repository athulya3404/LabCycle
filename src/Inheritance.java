class Base
{
    private int i;

    public void seti(int a)
    {
        i=a;
        System.out.println("value of i is set to " + i);
    }

    public int  geti()
    {
        System.out.println(" the current value of i is  " + i + "and it is returned " );
        return i;
    }

    public void finalize()
    {
        System.out.println("Garbage Collected");
    }
}

class Derived extends Base
{
    private int j;
    public void setj(int a)
    {
        j=a;
        System.out.println("value of j is set to " + j);
    }

    public int  getj()
    {
        System.out.println(" the current value of j is  " + j + "and it is returned " );
        return j;
    }

}
class Inheritance
{
    public static void main(String args[])
    {
        System.out.println(" working with base class object");
        Base objB = new Base();
        objB.seti(10);
        System.out.println(" the current value of i is received in main as -> "+ objB.geti());
        System.gc();


        System.out.println(" working with derived class object");
        Derived objD = new Derived();
        objD.seti(20);
        System.out.println(" the current value of i is received in main as -> "+ objD.geti());


        objD.setj(30);
        int k=objD.getj();
        System.out.println(" the current value of j is received in main as -> " + objD.getj() + k);

    }


}
