class test
{
    String name;
    int age;
    void getdata(String s,int i)
    {
        name=s;
        age=i;
    }
    void putdata()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
    public static void main(String args[])
    {
        test t=new test();
        t.getdata("shweta",65);
        t.putdata();
    }
}
