public class PrintOdd255 {
    public int getPrintOdd255() {
        int y = 0;
        for(int i=0;i<=255;i++){
            if(i%2 == 1){
               y = i;
            System.out.println(i);
            }
        }
        return y;
    }
}

// public class PrintOdd255 {
//     public int getPrintOdd255(){
//         int y = 0;
//         for(int i = 0; i <= 255; i++) {
//             y = i;
//           System.out.println(y);
//         }
//     } 
// }