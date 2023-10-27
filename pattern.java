public class pattern
{
    public static void main(String[] args)
    {
        //Scannner num = new Scanner(System.in);
        //int pat = num.nextInt();
        int pat = 10;
        for(int i=0; i<pat; i++)
        {
            for(int j=0; j<pat; j++)
            {
                if(i==0 || j==0 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print();
                }
            }
            System.out.print(" ");
        }
    }
}