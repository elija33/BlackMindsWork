package WindDirections;

public class Directions {
    public static int hallway(char array[]){
        int start = 0;
        int end = array.length;
        for(int i = 0; i < array.length; i++){
            if(array[i] == '>'){
                start = i;
            }
            else if(array[i] == '<'){
                end = i;
            }
        }
        int count = 0;
        if(start > 0){
            for(int k = start; k < array.length; k++){
                if(array[k] == 'i'){
                    count++;
                }
            }
        }
        return count;
    }
     public static void main(String[] args) {
        char[] hallway1 = {'.','.','>','.','i','i','.'}; 
        char[] hallway2 = {'i','>','.','i','.','i','.'}; 
        char[] hallway3 = {'i','.','<','.','.','.','.'}; 
        char[] hallway4 = {'.','i','<','i','.','.','.'};
        char[] hallway5 = {'<','i','i','i','i'};
        char[] hallway6 = {'>','i','i','i','i','>'};
        System.out.println(hallway(hallway2));
     }
}