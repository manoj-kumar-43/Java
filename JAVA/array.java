class array
{
    public static void main(String[] arg)
    {
        int[] numbers ={1,2,3,4,5};

        int sum = 0;
        for(int number : numbers)
        {
            sum+=number;
        }
        System.out.println("sum of the element:" +sum);
    }
}