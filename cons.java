class a{
    int c;
    String b;
    a()
    {
        this.c=345;
        this.b="hello manisha";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class cons{
    public static void main(String[] args){
        a s=new a();
        s.display();
    }
}