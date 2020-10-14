public class Mathey {


    public static int max(int one, int two)
    {
        return Math.max(one, two);
    }

    public static int max(int one, int two, int three)
    {
        return max(one, max(two, three));
    }

    public static double max(double one, double two)
    {
        return Math.max(one, two);
    }

    public static double max(double one, double two, double three)
    {
        return max(one, max(two, three));
    }



    public static int min(int one, int two)
    {
      return Math.min(one, two);
    }

    public static int min(int one, int two, int three)
    {
        return min(one, min(two, three));
    }

    public static double min(double one, double two)
    {
        return Math.min(one, two);
    }

    public static double min(double one, double two, double three)
    {
        return min(one, min(two, three));
    }


    public static int randomInteger(int a, int b)
    {
        return (int)(Math.random() * (1+b-a) + a);
    }

    public static int randomInteger(int b)
    {
        return randomInteger(0, b);
    }
}