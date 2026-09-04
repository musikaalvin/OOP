class OperatorDemo
{
    int a = 11;
    int b = 22;
    int c = 15;

    void increment()
    {
        if (a < b)
        {
            c++;
        }
    }

    void decrement()
    {
        if (c > 0)
        {
            c--;
        }
        else
        {
            c = 3;
        }
    }

    public static void main(String[] args)
    {
        OperatorDemo obj = new OperatorDemo();

        System.out.print("Value of a: " + obj.a);
        System.out.print("\nValue of b: " + obj.b);
        System.out.print("\nOriginal value of c: " + obj.c);

        obj.increment();
        System.out.print("\nAfter increment: " + obj.c);

        obj.decrement();
        System.out.print("\nAfter decrement: " + obj.c);
    }
}