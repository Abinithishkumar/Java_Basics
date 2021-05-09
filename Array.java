public class Array {

    public static void main(String[] args){

        int[] score = new int[10];  // 1st Method

        int[] anotherScore = {1, 2, 3, 4, 5, 6};   // 2nd Method

        score[0] = 1;
        score[2] = 2;

//        System.out.println(score[2]);

        for(int i = 0; i < score.length; i++){
            score[i] = i * 10;
        }
//        System.out.println(score[2]);
//        System.out.println(score[4]);
//        System.out.println(score[3]);

        for(int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

    }

}
