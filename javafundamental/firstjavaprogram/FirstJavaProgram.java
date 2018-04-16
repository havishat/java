// public class FirstJavaProgram {
//     public static void main(String [] args) {
//         System.out.println("My name is Coding Dojo");
//         System.out.println("I am 100 years old");
//         System.out.println("My hometown is Burbank, CA");
//     }
// }

public class FirstJavaProgram {
    public void countainDublicate (int nums[]) {
    // nums.sort(nums);
    
    // console.log(nums)
    
    for(var i=0; i<nums.length-1; i++) {
        if(nums[i] != nums[i+1]) {
            return true;
        }
        
    }
    return false;
}

public static void main (String [] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter numbers\n");
    int nums[]=sc.nextInt(args); 
    countainDublicate (nums);
}
}

