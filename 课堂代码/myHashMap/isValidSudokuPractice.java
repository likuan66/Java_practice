package biteHomework.MyHsahMap;

public class isValidSudokuPractice {
    public boolean isValidSudoku(char[][] board) {
        //记录某行，某位数字是否已经被摆放
        boolean[][] row=new boolean[9][9];
        //记录某列，某个数字是否被已经摆放
        boolean[][] col=new boolean[9][9];
        //记录某3*3宫格内，是否已经被填满
        boolean[][] block=new boolean[3][3];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num=board[i][j]-'1';
                    int blockIndex=i/3*3+j/3;
                    if(row[i][num]|| col[j][num] || block[blockIndex][num]){
                        return false;
                    }else{
                        row[i][num]=true;
                        col[j][num]=true;
                        block[blockIndex][num]=true;
                    }
                }
            }
        }
        return true;
    }
}
