public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        int evenDigitSum=0;
        int firstDigit =0;

        if(number <0){
            return -1;
        }else{

            while(number >0){

                firstDigit= number %10;
                if( firstDigit % 2 == 0 ){
                    evenDigitSum = firstDigit+ evenDigitSum;
                    System.out.println(evenDigitSum);
                    number/= 10;

                }else{
                    number/= 10;
                }
            }


        }

        return (evenDigitSum);
    }
}
