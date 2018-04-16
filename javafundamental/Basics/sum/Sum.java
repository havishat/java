public class Sum {
    public int getPrintSum() {
        int y = 0;
        int sum = 0;
        for(int i=0;i<=255;i++){
           sum = sum + i;
           System.out.println("New Number" + i + "sum" + sum);
        }
        return y;
    }
}