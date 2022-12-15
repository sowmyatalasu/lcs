public class lcs{
    public static void main(String[] args){
        int a[]={1,4,9,10,11,12,15,17,19,20,21,22};
        int b[]=new int[a.length];
        b[0]=1;
        int longS=1;
        int longStreak=1;
        int currentStreak=1;
        a=sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println(" ");
        for( int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                if(a[i]==a[i-1]+1){
                    currentStreak++;
                    b[i]=b[i-1]+1;
                }
                else{
                    longStreak=Math.max(longStreak,currentStreak);
                    currentStreak=1;
                    b[i]=1;
                }
            }
            longS=Math.max(longStreak,currentStreak);
        }
        System.out.println("length of the longest consecutive sequence is: "+longS);
        for(int j=0;j<a.length;j++){
            if(b[j]==longS){
                System.out.println("the longest consecutive number of the series is "+a[j]);
            }
        }
        
    }
    public static int[] sort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int t;
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        return a;
    }
}