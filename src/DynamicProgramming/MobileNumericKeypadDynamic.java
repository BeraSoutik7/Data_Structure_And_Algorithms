package DynamicProgramming;

public class MobileNumericKeypadDynamic {
    public static int getCount(char[][] arr, int n){
        int row[] = {0,1,-1,0,0};
        int col[] = {0,0,0,1,-1};
        if(n==0){
            return 0;
        }
        if(n==1){
            return 10;
        }
        int cnt[][] = new int[10][n+1];
        for (int i = 0; i <=9 ; i++) {
            cnt[i][0]=0;
            cnt[i][1]=1;
        }

        for (int i = 2; i <=n; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    int num = 0;
                    if(arr[j][k]!='*' && arr[j][k]!='#') {
                        num = arr[j][k] - '0';
                        cnt[num][i] = 0;

                        int ro = 0;
                        int co = 0;
                        int nextNum = 0;
                        for (int l = 0; l < 5; l++) {
                            ro = j + row[l];
                            co = k + col[l];
                            if (ro >= 0 && ro < 4 && co >= 0 && co < 3 && arr[ro][co] != '*' && arr[ro][co] != '#') {
                                nextNum = arr[ro][co] - '0';
                                cnt[num][i] += cnt[nextNum][i - 1];
                            }
                        }
                    }
                }
            }
        }
        int totalCount=0;
        for (int i = 0; i < 10; i++) {
            totalCount+=cnt[i][n];
        }
        return totalCount;

    }
    public static void main(String[] args) {
        char [][]keypad={{'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}};
        System.out.println(getCount(keypad,22));
    }
}
