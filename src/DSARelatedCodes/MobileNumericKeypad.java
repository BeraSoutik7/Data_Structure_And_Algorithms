package DSARelatedCodes;

public class MobileNumericKeypad {
    public static void getCount(char arr[][], int n){
        if(n==1){
            System.out.println(10);
            return ;
        }
        int totalCount =0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if(arr[i][j]!='*' && arr[i][j]!='#') {
                    totalCount += getCountUntil(arr, i, j, n);
                }
            }
        }
        System.out.println(totalCount);
    }
    public static int getCountUntil(char [][]arr,int i,int j,int n){
        if(arr==null || n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int []row={0,-1,1, 0,0};
        int []col={0, 0,0,-1,1};
        int totalCount = 0;
        for (int k = 0; k < 5; k++) {
            int ro = i+ row[k];
            int co = j+ col[k];
            if( ro>=0 && ro<4 && co>=0 && co<3 && arr[ro][co]!='*' && arr[ro][co]!='#'  ){
                totalCount+=getCountUntil(arr,ro,co,n-1);
            }
        }
        return totalCount;
    }
    public static void main(String[] args) {
        char [][]keypad={{'1','2','3'},
                        {'4','5','6'},
                        {'7','8','9'},
                        {'*','0','#'}};
        getCount(keypad,2);
    }
}
