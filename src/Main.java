public class Main {
    public static void main(String[] args) {

        String fname = "irvansah", lname = "Satria";
        System.out.println(fname + " " + lname );

        int age = 24, score = 95;
        float tb = 178.5f;

        float num1 = 19.5f;
        int num2 = (int)num1;

        System.out.println("hello " + "my name is " + fname + " " + lname + " \n my age is " + age + "and my height " + tb);
        System.out.println("float 19.5 to int = " + num2 );

        if (age > 18){
            System.out.println("Kamu bisa memilih");

        }else if (age >= 17){
            System.out.println("Kamu harus memiliki kartu identitas terlebih dahulu");
        }else{
            System.out.println("Kamu belum bisa memilih");
        }

        //shorthand if-else
        String result = (score <= 75 ) ?  "Tidak bisa melanjutkan" : "Silahkan lanjut ke step berikutnya";
        System.out.println(result);


        //while loops

        int start = 0;
        while (start <= 10){
            System.out.println("angka " + start);
            start++;
        }

        // do while, kalo ini dilakuin dulu baru di cek
        int mulai = 0;
        do{
            System.out.println("number " + mulai);
            mulai++;
        }while(mulai<=10);

        //for loops
        for (int dari = 1; dari<=5; dari++){
            System.out.println("ini akan di print sebanyak " + dari + " kali");
        }

        //for each

        String[] friend = {"Dennis","James","Rose"};
        for (String i: friend){
            System.out.println("our friends is " + i);
        }

        String[] fruit = {"Banana","Apple","Pear"};
        for (int a = 0; a<= fruit.length; a++){
            System.out.println(fruit[a]);
        }
    }
}
