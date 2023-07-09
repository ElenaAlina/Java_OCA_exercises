public class ForLoopExercises {
    public static void main(String[] args) {
        //create a vector using for loop, with 10 elements and display odd and even numbers
                //create a vector using for while,with 10 elements and display even numbers
                int[] numberList = {1,2,3,4,5,6,7,8,9,10};
                int y = numberList.length;

// ********************************************************************************************
// displays the whole list of numbers

//for(int x=0;x<=10; x+=1){
//     System.out.println(x);
//}
// ********************************************************************************************
// displays only the even numbers
//for(int x=0;x<=10; x+=2){
//    System.out.println(x);
//}

// ********************************************************************************************
                //displays only the odd numbers
        for(int x=1;x<=10; x+=2){
            System.out.println(x);
        }
    }
}
