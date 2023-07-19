package exercise.chapter_16;

import exercise.chapter_14.StringFormat;

public class AvocadoSituation {

    public static void main(String[] args) {
        int size = 3;

        for(int i =0; i <= size; i++){

            for(int j =size; j < size; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}


/*
 조건식 ? TRUE일때값 : FALSE일때값
  IF else-if문
   if(조건식){
    수행문
   }else if(조건){
    수행문
   }else{
    수행문
   }

   switch문

   switch(변수){
    case 값:
        실행문;
        break;
     defalut:
        실행문;
        break;
   }

 */