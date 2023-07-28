public class Palindrome {
    public static void main(String[] args) {

        int number;
        int reversedNumber;
        int temporaryn;
        int modulus;


        number = 4004;
        reversedNumber = 0;

        while(number > 0){


            // 4004 = 4 // 400 = 0 // 40 = 0 // 4 = 4 // from the line of 23
            modulus = number % 10; // sayının /10 ile bölündüğü zaman ki kalanını bize vericek.
            System.out.println(modulus);
            reversedNumber = (reversedNumber *10) + modulus;
        //    System.out.println(reversedNumber);
            // 0 * 10 + 4  = 4 // 4 * 10 + 0 = 40

            number = number / 10; // bu döngünün ne kadar süreceğini bize sağlayacak
            // 4004 --> 400 --> 40 --> 4[last] ---> 0 [end]
        }

        temporaryn = number;
        if(temporaryn == number) {
            System.out.println("palindrome");
        }else{
            System.out.println("it is not palindrome");
        }




    }
}
