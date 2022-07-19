public class Arrays{
    public static void main(String... args) {
        int [][] arr = {
                {1 ,2, 3, 4},
                {32, 34, 56, 98},
                {32, 34, 56, 98},
                {123, 5666, 1444, 55445, 565, 788}
        };


//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i < arr.length; i++) {
//            for(int element: arr[i]){
//                System.out.print(element+" ");
//            }
//            System.out.println();
//        }


//
//        String apple = "Mritunjay Jha";
//        String mango = new String("Mritunjay Jha");
//        if(apple == mango){
//            System.out.println("The numbers are same");
//        }
//        else{
//            System.out.println("The numbers are not same");
//        }
//        if(apple.equals(mango)){
//            System.out.println("The numbers are same");
//        }
//        else{
//            System.out.println("The numbers are not same");
//        }
//
//        if(apple.compareTo(mango) == 1){
//            System.out.println("the string is not same");
//        }else{
//            System.out.println("The string are same");
//        }
        String myString = "apple.txt";

        int idx = myString.indexOf('.');
        String subString = myString.substring(idx);
        System.out.println(subString);
    }
}