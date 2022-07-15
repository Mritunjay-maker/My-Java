public class chessGame {
    public static void main(String[] args) {
        char whiteSpace = '\u25A0';
        char blackSpace = '\u25a1';

        for(int i = 0; i < 8; i++){
            if(i % 2 != 0){
                for(int j = 0; j < 8; j++){
                    if(j % 2 != 0){
                        System.out.print(blackSpace + " ");
                    }else{
                        System.out.print(whiteSpace+ " ");
                    }
                }
            }
            else{
                for(int j = 0; j < 8; j++){
                    if(j % 2 == 0){
                        System.out.print(blackSpace + " ");
                    }else{
                        System.out.print(whiteSpace+ " ");
                    }
                }

            }
            System.out.println();

        }
    }
}
