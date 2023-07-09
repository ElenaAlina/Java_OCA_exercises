public class WhileStructureExercise {
        public static void main(String[] args) {
            //create a vector using for while,with 10 elements and display even numbers
            int[] numberList = {1,2,3,4,5,6,7,8,9,10};
            int y = numberList.length;

// ********************************************************************************************
            //displays the whole list of numbers
            //int x = 0;
//            while(x<y){
//                System.out.println(numberList[x] + " ");
//                x += 1;
//            }
// ********************************************************************************************
            //displays only the even numbers
//            int x = 0;
//            while(x<=y){
//                System.out.println(x + " ");
//                x +=2;
//            }
// ********************************************************************************************
            //displays only the odd numbers
            int x = 1;
            while(x<=y){
                System.out.println(x + " ");
                x +=2;
            }


        }
}
